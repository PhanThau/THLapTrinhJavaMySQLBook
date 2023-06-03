package phanthaucom.example.THJavaLab03.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import phanthaucom.example.THJavaLab03.entity.User;
import phanthaucom.example.THJavaLab03.repository.IRoleRepository;
import phanthaucom.example.THJavaLab03.repository.IuserRepository;

@Service
public class UserService {
    @Autowired
    private IuserRepository userRepository;

    @Autowired
    private IRoleRepository roleRepository;
    public void save(User user){
        userRepository.save(user);
        Long userId = userRepository.getUserIdByUsername(user.getUsername());
        Long roleId = roleRepository.getRoleIdByName("USER");
        if(roleId!=0 && userId !=0){
            userRepository.addRoleToUser(userId, roleId);
        }
    }
}
