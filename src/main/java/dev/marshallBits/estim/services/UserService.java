package dev.marshallBits.estim.services;

import dev.marshallBits.estim.dto.CreateUserDTO;
import dev.marshallBits.estim.dto.SignupResponseDTO;
import dev.marshallBits.estim.models.User;

public interface UserService {

    SignupResponseDTO registerUser(CreateUserDTO createUserDTO);

}
