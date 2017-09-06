package app.services;
import app.dto.add.AddBranchDto;

public interface BranchService {

    void save(AddBranchDto branch);

   void save(Iterable<AddBranchDto> branchs);

}
