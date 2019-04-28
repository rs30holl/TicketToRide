import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ButtonItem
{
    private JButton button;

    public ButtonItem(String name)
    {
        this.button = new JButton(name);
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println(button.getText() + " was clicked.");
            }
        });
    }

    public JButton getButton()
    {
        return button;
    }

    @Override
    public String toString()
    {
        return button.getText();
    }
}

class ButtonListRenderer extends JButton implements ListCellRenderer
{
    public Component getListCellRendererComponent(JList comp, Object value, int index,
                                                  boolean isSelected, boolean hasFocus)
    {
        setEnabled(comp.isEnabled());
        setFont(comp.getFont());
        setText(value.toString());

        if (isSelected)
        {
            setBackground(comp.getSelectionBackground());
            setForeground(comp.getSelectionForeground());
        }
        else
        {
            setBackground(comp.getBackground());
            setForeground(comp.getForeground());
        }

        return this;
    }
}

