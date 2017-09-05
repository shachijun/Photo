package Photos.model;

import java.io.Serializable;

/**
 * Created by shachijun on 2017/4/12.
 */
public class SearchPhoto  implements Serializable {
        Photo o;
    Album album;
    public SearchPhoto(Photo photo, Album from){
        o=photo;
         album=from;
    }
    public Photo GetPhoto(){
        return o;
    }
}
