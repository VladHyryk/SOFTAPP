package SOFTAPP.com.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
/**
 *
 */
public class GwtApp implements EntryPoint {

    final private Button confirmButton = new Button("Magical button");
    final private Label helloLabel = new Label();
    final private HTML body = new HTML();

    /**
     Задача: Средствами GWT создать HTML- страницу.
     В центре страницы размещаем кнопку. По нажатию кнопки фон страницы должен изменить цвет.
     Вся функциональность программы должна быть размещена на стороне клиента.
     */
    public void onModuleLoad() {

        helloLabel.setText("Test assignment fo SoftApp");
        /*Связываем id='' на html странице с компонентами */
        RootPanel.get("bodyId").add(body);
        RootPanel.get("helloId").add(helloLabel);
        RootPanel.get("confirmButtonId").add(confirmButton);

        //обработчик для клика по кнопке 'Magical button'
        confirmButton.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                double rgb[] = new double[3];
                for (int i = 0; i < rgb.length; i++) {
                    rgb[i] = (int) (Math.random() * ((255) + 1));
                    String color = rgb[0] + ", " + rgb[1] + ", " + rgb[2];
                    body.getElement().getStyle().setBackgroundColor("rgb("+color+")");
                }
            }
        });

    }
}