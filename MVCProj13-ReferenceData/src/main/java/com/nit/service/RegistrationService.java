package com.nit.service;

import java.util.List;

import com.nit.dto.RegDTO;

public interface RegistrationService {
public List<String> getCourses();
public List<String> getHobbies();
public List<String> getGenders();
public List<String> getCountries();
public String register(RegDTO dto);
}
