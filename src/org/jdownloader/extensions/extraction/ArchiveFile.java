package org.jdownloader.extensions.extraction;

import java.awt.Color;

import org.jdownloader.controlling.FileCreationManager;

public interface ArchiveFile {

    public boolean isComplete();

    public String getFilePath();

    public long getFileSize();

    public void deleteFile(FileCreationManager.DeleteOption option);

    public void deleteLink();

    public boolean exists();

    public String getName();

    public void setStatus(ExtractionController controller, ExtractionStatus error);

    public void setMessage(ExtractionController controller, String plugins_optional_extraction_status_notenoughspace);

    public void setProgress(ExtractionController controller, long value, long max, Color color);

    public void removePluginProgress(ExtractionController controller);

    public void onCleanedUp(ExtractionController controller);

    public void setArchive(Archive archive);

    public void notifyChanges(Object type);

}
