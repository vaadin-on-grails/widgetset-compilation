package app

import com.vaadin.server.VaadinRequest
import com.vaadin.ui.UI
import com.vaadin.ui.VerticalLayout
import org.vaadin.tokenfield.TokenField

class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {

        VerticalLayout layout = new VerticalLayout()
        layout.setMargin(true)

        TokenField f = new TokenField("Add tags")
        layout.addComponent(f)

        setContent(layout)
    }
}
