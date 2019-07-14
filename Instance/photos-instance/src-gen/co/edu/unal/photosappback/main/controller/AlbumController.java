// ----------------------------------------
// Controller
// PackageName: co.edu.unal.photosappback.main.controller
// ClassName: AlbumController
// ----------------------------------------	

package co.edu.unal.photosappback.main.controller;

import co.edu.unal.photosappback.main.controller.AlbumRepository;
import co.edu.unal.photosappback.main.controller.PhotoRepository;
import co.edu.unal.photosappback.main.controller.UserRepository;


@RestController
@RequestMapping("/album")

public class AlbumController {
	
	@Autowired
	AlbumRepository albumRepository;
	
	@Autowired
	PhotoRepository photoRepository;
	
	@Autowired
	UserRepository userRepository;
	
	
	
	@RequestMapping(value = "/id/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> getAlbum(@PathVariable Long id) throws Exception {

		Album album = null;

		try {
			album = albumRepository.getOne(id.intValue());

		} catch(Exception e) {
			throw new AlbumNotFoundException();
		}

		if(album == null){
			throw new AlbumNotFoundException();
		}

		return new ResponseEntity<>(album, HttpStatus.OK);
	}






	
	
	
	
	
	
	
}
