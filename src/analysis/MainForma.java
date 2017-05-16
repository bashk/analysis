package analysis;
public class MainForma extends javax.swing.JFrame
{
    public MainForma(){
	initComponents();
    }
    /**
    * This method is called from within the constructor to initialize the form.WARNING:DoNOT
    * modify this code.ThecontentofthismethodisalwaysregeneratedbytheFormEditor.
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        dataCounterJp1 = new guis.CheckerJp();
        oneClickAll2 = new guis.OneClickAll();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Checker and Analyse");
        setResizable(false);

        jTabbedPane1.addTab("Checker", dataCounterJp1);
        jTabbedPane1.addTab("One Click Parser", oneClickAll2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]){
	/*SettheNimbuslookandfeel*/
	//<editor-folddefaultstate="collapsed"desc="Lookandfeelsettingcode(optional)">
	/*IfNimbus(introducedinJavaSE6)isnotavailable,staywiththedefaultlookandfeel.
	*Fordetailsseehttp://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
	*/
	try{
	    for(javax.swing.UIManager.LookAndFeelInfo info:javax.swing.UIManager.getInstalledLookAndFeels()){
		if("Nimbus".equals(info.getName())){
		javax.swing.UIManager.setLookAndFeel(info.getClassName());
		break;
	    }
	}
	}catch(ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex){
	java.util.logging.Logger.getLogger(MainForma.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
	}
	//</editor-fold>
	
	//</editor-fold>

	/*Createanddisplaytheform*/
	java.awt.EventQueue.invokeLater(new Runnable(){
	    @Override
	    public void run(){
		new MainForma().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private guis.CheckerJp dataCounterJp1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private guis.OneClickAll oneClickAll2;
    // End of variables declaration//GEN-END:variables
}