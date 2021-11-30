package nz.sypnosis.service;

import nz.sypnosis.PruebaSypnosis.InterfaceServices.IClient_Services;
import nz.sypnosis.PruebaSypnosis.interfaces.IClient;
import nz.sypnosis.PruebaSypnosis.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService implements IClient_Services {
    @Autowired
    private IClient data;

    @Override
    public List<Client> list() {
        return (List<Client>)data.findAll();
    }

    @Override
    public Optional<Client> listId(int id) {
        return Optional.empty();
    }

    @Override
    public int save(Client c) {
        int res = 0;
        Client client=data.save(c);
        if(!client.equals(null)){
            res=1;
        }
        return 0;
    }

    @Override
    public void delete(int id) {

    }
}
