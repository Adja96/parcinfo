"# spring_parcinfo" 
# Definir les exeptions
#Creer un un service AppRoleService
#Creer les mapper

#Creation d'une classe rest controller AppRoleRestController.java
#Ajouter les dépendances
@RestController
@RequestMapping("/approle")

#Faire appel à la couche service
#Créer un constructeur qui prend en parametre le service correspondant
 public AppRoleRestController(AppRoleService appRoleService){...}

#Créer des requetes http
#Récupérer le liste des roles
@GetMapping
  public List<AppRole> getAppRoles(){
        return appRoleService.getAppRoles();
    }
#Récupérer le role à partir de son id
 @GetMapping("/{id}")
    public AppRole getAppRole(@PathVariable("id") int id){
        return appRoleService.getAppRole(id);
    }
#Enregistrer u role
 @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public AppRole createAppRole(@Valid @RequestBody AppRole role){
        return appRoleService.createAppRole(role);
    }
#Modifier
 @PutMapping("/{id}")
    public AppRole updateRole(@PathVariable("id") int id, @Valid @RequestBody AppRole role){
        return appRoleService.updateAppRole(id, role);
    }
#Supprimer
 @DeleteMapping("/{id}")
    public void deleteAppRole(@PathVariable("id") int id){
        appRoleService.deleteAppRole(id);
        return;
    }

