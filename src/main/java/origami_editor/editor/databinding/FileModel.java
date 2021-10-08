package origami_editor.editor.databinding;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

public class FileModel implements Serializable {
    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    private String savedFileName;

    public boolean isSaved() {
        return saved;
    }

    public void setSaved(boolean saved) {
        boolean oldSaved = this.saved;
        this.saved = saved;
        this.pcs.firePropertyChange("saved", oldSaved, saved);
    }

    private boolean saved;

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.removePropertyChangeListener(listener);
    }

    public String getSavedFileName() {
        return savedFileName;
    }

    public void setSavedFileName(String savedFileName) {
        String oldSavedFileName = this.savedFileName;
        this.savedFileName = savedFileName;
        this.pcs.firePropertyChange("savedFileName", oldSavedFileName, savedFileName);
    }

    public void reset() {
        saved = true;
        savedFileName = null;

        this.pcs.firePropertyChange(null, null, null);
    }
}
