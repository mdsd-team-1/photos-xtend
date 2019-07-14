// ----------------------------------------
// Controller
// PackageName: co.edu.unal.photosappback.main.controller
// ClassName: UserController
// ----------------------------------------	

package co.edu.unal.photosappback.main.controller;

import co.edu.unal.photosappback.main.controller.AlbumRepository;
import co.edu.unal.photosappback.main.controller.PhotoRepository;
import co.edu.unal.photosappback.main.controller.UserRepository;


@RestController
@RequestMapping("/user")

public class UserController {
	
	@Autowired
	AlbumRepository albumRepository;
	
	@Autowired
	PhotoRepository photoRepository;
	
	@Autowired
	UserRepository userRepository;
	
	
	
	@RequestMapping(value = "/id/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> getUser(@PathVariable Long id) throws Exception {

		User user = null;

		try {
			user = userRepository.getOne(id.intValue());

		} catch(Exception e) {
			throw new UserNotFoundException();
		}

		if(user == null){
			throw new UserNotFoundException();
		}

		return new ResponseEntity<>(user, HttpStatus.OK);
	}






	
	
	
	
	
	
	
}
