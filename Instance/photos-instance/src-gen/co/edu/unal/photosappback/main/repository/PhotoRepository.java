// ----------------------------------------
// Template for Interface
// PackageName: co.edu.unal.photosappback.main.repository
// ClassName: PhotoRepository
// ----------------------------------------	

package co.edu.unal.photosappback.main.repository;


public interface PhotoRepository extends JpaRepository<Album, Integer>, JpaSpecificationExecutor<Album>{
	
	
}
