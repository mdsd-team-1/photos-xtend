// ----------------------------------------
// Controller
// PackageName: co.edu.unal.photosappback.main.controller
// ClassName: AlbumController
// ----------------------------------------	

package co.edu.unal.photosappback.main.controller;

import co.edu.unal.photosappback.main.controller.AlbumRepository;
import co.edu.unal.photosappback.main.controller.PhotoRepository;
import co.edu.unal.photosappback.main.controller.UserRepository;


public class AlbumController {
	
	@Autowired
	AlbumRepository albumRepository;
	
	@Autowired
	PhotoRepository photoRepository;
	
	@Autowired
	UserRepository userRepository;
	
	
}
