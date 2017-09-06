package app.services;

import app.dto.add.AddBranchDto;
import app.models.Branch;
import app.repositories.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class BranchServiceImpl implements BranchService {

    private final BranchRepository branchRepository;

    @Autowired
    public BranchServiceImpl(BranchRepository branchRepository) {
        this.branchRepository = branchRepository;
    }

    @Override
    public void save(AddBranchDto branch) {
    }

    @Override
    public void save(Iterable<AddBranchDto> branchs) {
    }

}
