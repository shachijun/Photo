package Photos.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.Serializable;
import java.util.ArrayList;


/**
 * This class helps to search through tags.
 * @author William Chen
 * @author Chijun Sha
 */
public class TagSearchCondition implements Serializable {

	/**
	 * Serial Version UID
	 */
	private static final long serialVersionUID = 3520630274431813396L;


    /**
     * @param isStore Checks whether list of tags is null or not
     */
    public void doCleanUp(boolean isStore) {
		if (isStore) {
			listOfTagsToKeep = new ArrayList<>(listTags);
			listTags 		= null;
		}
		else {
			listTags 		= FXCollections.observableList(listOfTagsToKeep);
			listOfTagsToKeep = null;
		}
	}


    /**
     * List of tags (For serialization)
     */
    private ObservableList<Tag> listTags;

    /**
     * List of tags (After serialization)
     */
    private ArrayList<Tag> listOfTagsToKeep;


    /**
     * Initialize fields
     */
    public TagSearchCondition() {
	    listTags = FXCollections.observableArrayList();
	}


    /**
     * @return List of tags
     */
    public ObservableList<Tag> getTags() {
		return listTags;
	}


    /**
     * @param tagName Tag name
     * @param tagValue Tag value
     */
    public void addTag(String tagName, String tagValue) {
    	Tag t = new Tag(tagName, tagValue);
    	//
        Helper.addOrRetrieveOrderedList(listTags, t);
    }
}