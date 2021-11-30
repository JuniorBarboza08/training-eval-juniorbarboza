package nz.sypnosis.PruebaSypnosis.interfaces;

import nz.sypnosis.PruebaSypnosis.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClient extends CrudRepository<Client, Integer> {

}
