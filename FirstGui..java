import java.awt.*;  
class FirstGui extends Frame{
    FirstGui(){  
        Button b=new Button("click me");  
        b.setBounds(30,100,180,50);// setting button position  
        add(b);//adding button into frame  
        setSize(300,300);//frame size 300 width and 300 height  
        setLayout(null);//no layout manager  
        setVisible(true);//now frame will be visible, by default not visible  
    
    }
    public static void main(String args[]){  
        FirstGui f=new FirstGui();  
    }
}  