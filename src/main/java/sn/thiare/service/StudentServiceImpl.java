package sn.thiare.service;

import org.springframework.stereotype.Service;
import sn.thiare.repository.StudentRepository;
import sn.thiare.service.dto.StudentDTO;
import sn.thiare.service.mapper.StudentMapper;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    public StudentServiceImpl(StudentRepository studentRepository, StudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }

    @Override
    public StudentDTO save(StudentDTO dto) {
        return studentMapper.toDto(studentRepository.save(studentMapper.toEntity(dto)));
    }

    @Override
    public Optional<StudentDTO> findOne(Long id) {
        return studentRepository.findById(id).map(studentMapper::toDto);
    }

    @Override
    public List<StudentDTO> findAll() {
        return studentRepository.findAll().stream().map(studentMapper::toDto).collect(java.util.stream.Collectors.toList());
    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }
}
