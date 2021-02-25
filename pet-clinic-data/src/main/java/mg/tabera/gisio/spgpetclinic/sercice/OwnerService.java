package mg.tabera.gisio.spgpetclinic.sercice;

import mg.tabera.gisio.spgpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}
