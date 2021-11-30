package nz.sypnosis.PruebaSypnosis.InterfaceServices;

import nz.sypnosis.PruebaSypnosis.model.Client;

import java.util.List;
import java.util.Optional;

public interface IClient_Services {
    public List<Client>list();
    public Optional<Client>listId(int id);
    public int save(Client c);
    public void delete(int id);
}
