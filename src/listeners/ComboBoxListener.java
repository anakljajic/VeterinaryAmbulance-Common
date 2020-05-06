package listeners;

import events.SelectionChangeEvent;

/**
 *
 * @author anakl
 */
public interface ComboBoxListener {

    void onChangeSelected(SelectionChangeEvent evt, Object object);
}
