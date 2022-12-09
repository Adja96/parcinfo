package isi.afagroupe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUser extends JpaRepository<AppUser,Integer> {
    AppUser findByEmail(String email);
}
