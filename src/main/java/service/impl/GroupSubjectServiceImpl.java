package service.impl;

import Repository.GroupSubjectRepository;
import service.GroupSubjectService;
import models.Group_Subject;
import java.util.List;

public class GroupSubjectServiceImpl implements GroupSubjectService {

    private final GroupSubjectRepository groupSubjectRepository;

    public GroupSubjectServiceImpl(GroupSubjectRepository groupSubjectRepository) {
        this.groupSubjectRepository = groupSubjectRepository;
    }

    @Override
    public Group_Subject create(Group_Subject groupSubject) {
        return groupSubjectRepository.createGroupSubject(groupSubject);
    }

    @Override
    public boolean update(Group_Subject updateGroupSubject) {
        return groupSubjectRepository.updateGroupSubject(updateGroupSubject);
    }

    @Override
    public boolean delete(Long groupSubjectId) {
        return groupSubjectRepository.deleteGroupSubject(groupSubjectId);
    }

    @Override
    public Group_Subject findById(Long groupSubjectId) {
        return groupSubjectRepository.findById(groupSubjectId);
    }

    @Override
    public List<Group_Subject> findAll() {
        return groupSubjectRepository.findAll();
    }
}

