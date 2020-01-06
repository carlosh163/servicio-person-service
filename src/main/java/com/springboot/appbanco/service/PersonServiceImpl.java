package com.springboot.appbanco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.appbanco.model.Account;
import com.springboot.appbanco.model.PersonAuthorized;
import com.springboot.appbanco.repo.IPersonRepo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonServiceImpl implements IPersonService {

	@Autowired
	IPersonRepo repo;

	@Override
	public Flux<PersonAuthorized> findAll() {
		return repo.findAll();
	}

	@Override
	public Mono<PersonAuthorized> findById(String id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public Flux<PersonAuthorized> create(Account account) {

		return Mono.just(account).map(objacc -> {

			return objacc.getPersonAuthorizedList();
		}).flatMapMany(lstC -> Flux.fromIterable(lstC)).flatMap(objC -> {

			String DNI = objC.getDocumentNumber();

			Account objAcNew = new Account();

			objAcNew.setProductType(account.getProductType());
			objAcNew.setAccountType(account.getAccountType());
			objAcNew.setAccountNumber(account.getAccountNumber());
			objAcNew.setOpeningDate(account.getOpeningDate());
			objAcNew.setBalance(account.getBalance());
			objAcNew.setAccountstatus(account.getAccountstatus());
			objAcNew.setNumMaxDesposit(account.getNumMaxDesposit());
	        objAcNew.setNumMaxRetirement(account.getNumMaxRetirement());
	        objAcNew.setMinBalanceEndMonth(account.getMinBalanceEndMonth());
	        objAcNew.setBankName(account.getBankName());
			objC.getAccountList().add(objAcNew); // List<Client> info..

			return repo.findBydocumentNumber(DNI).switchIfEmpty(Mono.just(objC)).flatMap(objAC -> {
				if (objAC.getIdPersonAutho() != null) {

					return repo.findById(objAC.getIdPersonAutho()).flatMap(client -> {

						client.getAccountList().add(objAcNew);
						return repo.save(client);
					});

				} else {
					return repo.save(objAC);
				}

			});
		});

	}

	@Override
	public Mono<PersonAuthorized> update(PersonAuthorized perso, String id) {
		// TODO Auto-generated method stub
		
		  return repo.findById(id).flatMap(persoA ->{
			  /*
		  persoA.setNombres(perso.getNombres());
		  persoA.setApellidos(perso.getApellidos());
		  persoA.setTipoDocumento(perso.getTipoDocumento());
		  persoA.setNroDocumento(perso.getNroDocumento());
		  persoA.setEstado(perso.getEstado()); */
		  return repo.save(persoA); 
		  });
		 
	}

	@Override
	public Mono<Void> delete(String id) {
		// TODO Auto-generated method stub
		return repo.findById(id).flatMap(client -> repo.delete(client));
	}

	@Override
	public Flux<PersonAuthorized> findByPersonsByAccountNumber(Integer accNumber) {
		return repo.findByPersonByAccountNumber(accNumber);
	}

	@Override
	public Mono<PersonAuthorized> createPPerson(PersonAuthorized persoAutho) {
		return repo.save(persoAutho);
	}

}
