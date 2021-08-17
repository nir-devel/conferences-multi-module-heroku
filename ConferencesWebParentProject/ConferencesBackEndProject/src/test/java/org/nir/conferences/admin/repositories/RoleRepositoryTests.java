package org.nir.conferences.admin.repositories;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.nir.conferences.admin.user.RoleRepository;
import org.nir.conferences.common.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class RoleRepositoryTests 
{
	@Autowired  RoleRepository roleRepository;
	
	@Test
	@DisplayName("When Creating Role")
	public void testCreateFirstRole()
	{
		//GIVEN
		Role role = new Role( "Admin", "Manage Everything!");
		
		//WHEN
		Role savedRole = this.roleRepository.save(role);
		
		//THEN
		assertThat(savedRole).isNotNull();
		assertThat(savedRole.getId()).isGreaterThan(0);
		
	}

}
