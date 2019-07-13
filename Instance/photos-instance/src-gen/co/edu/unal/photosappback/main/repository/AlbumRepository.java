// ----------------------------------------
// PackageName: co.edu.unal.photosappback.main.repository
// ClassName: AlbumRepository
// ----------------------------------------	


package co.edu.unal.photosappback.main.repository;

public interface AlbumRepository extends JpaRepository<Album, Integer>, JpaSpecificationExecutor<Album>{
	
	
}
