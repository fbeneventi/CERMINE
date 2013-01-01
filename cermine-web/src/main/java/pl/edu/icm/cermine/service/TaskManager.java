package pl.edu.icm.cermine.service;

import java.util.List;

/**
 *
 * @author Aleksander Nowinski <a.nowinski@icm.edu.pl>
 */
public interface TaskManager {

    ExtractionTask getTask(long id) throws NoSuchTaskException;

    long registerTask(ExtractionTask task);
    
    List<ExtractionTask> taskList();

    String getProperFilename(String filename);
    
}
