package Repository.impl;

import Repository.GroupSubjectRepository;
import models.Group_Subject;
import java.util.ArrayList;
import java.util.List;

public class GroupSubjectRepositoryInMemory implements GroupSubjectRepository {

    private List<Group_Subject> groupSubjects;
    private Long nextGroupSubjectId;

    public GroupSubjectRepositoryInMemory() {
        this.groupSubjects = new ArrayList<>();
        this.nextGroupSubjectId = 1L;
    }

    @Override
    public Group_Subject createGroupSubject(Group_Subject groupSubject) {
        if (groupSubject == null) {
            return null;
        }
        groupSubject.setGroupSubjectId(nextGroupSubjectId++);
        groupSubjects.add(groupSubject);
        return groupSubject;
    }

    @Override
    public boolean deleteGroupSubject(Long groupSubjectId) {
        Group_Subject groupSubject = findById(groupSubjectId);
        if (groupSubject == null) {
            return false;
        }
        return groupSubjects.remove(groupSubject);
    }

    @Override
    public boolean updateGroupSubject(Group_Subject groupSubject) {
        if (groupSubject == null || groupSubject.getGroupSubjectId() == null) {
            return false;
        }
        for (int i = 0; i < groupSubjects.size(); i++) {
            if (groupSubjects.get(i).getGroupSubjectId().equals(groupSubject.getGroupSubjectId())) {
                groupSubjects.set(i, groupSubject);
                return true;
            }
        }
        return false;
    }

    @Override
    public Group_Subject findById(Long groupSubjectId) {
        if (groupSubjectId == null) {
            return null;
        }
        for (Group_Subject groupSubject : groupSubjects) {
            if (groupSubject.getGroupSubjectId().equals(groupSubjectId)) {
                return groupSubject;
            }
        }
        return null;
    }

    @Override
    public List<Group_Subject> findAll() {
        return new ArrayList<>(groupSubjects);
    }

    @Override
    public boolean existsById(Long groupSubjectId) {
        return findById(groupSubjectId) != null;
    }
}

