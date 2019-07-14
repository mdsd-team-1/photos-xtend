// ----------------------------------------
// Template for Class
// PackageName: co.edu.unal.photosappback.main.controller
// ClassName: UserController
// ----------------------------------------	

package co.edu.unal.photosappback.main.controller;

import co.edu.unal.photosappback.main.controller.AlbumRepository;
import co.edu.unal.photosappback.main.controller.PhotoRepository;
import co.edu.unal.photosappback.main.controller.UserRepository;


public class UserController {
	
	@Autowired
	AlbumRepository albumRepository
	
	@Autowired
	PhotoRepository photoRepository
	
	@Autowired
	UserRepository userRepository
	
	
}
