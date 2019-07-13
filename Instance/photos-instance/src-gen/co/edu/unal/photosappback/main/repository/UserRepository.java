// ----------------------------------------
// PackageName: co.edu.unal.photosappback.main.repository
// ClassName: UserRepository
// ----------------------------------------	


package co.edu.unal.photosappback.main.repository;

public interface UserRepository extends JpaRepository<Album, Integer>, JpaSpecificationExecutor<Album>{
	
	
}
