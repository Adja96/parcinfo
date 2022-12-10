package isi.afagroupe.mapping;

import isi.afagroupe.dto.AppRole;
import isi.afagroupe.entities.AppRoleEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AppRoleMapper {
    AppRoleEntity fromAppRole(AppRole appRole);
    AppRole toAppRole(AppRoleEntity appRoleEntity);
}
