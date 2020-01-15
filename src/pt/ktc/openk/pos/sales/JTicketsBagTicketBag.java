/* (c) KTC, Lda / www.openk.pt / Alexandre Braganca
 * 
 *
 * */
package pt.ktc.openk.pos.sales;

import java.awt.CardLayout;

import javax.swing.JOptionPane;

import pt.ktc.openk.pos.utils.StringConstants;
import pt.ktc.openk.pos.utils.StringEnumerates;

import com.openbravo.pos.forms.AppLocal;

public class JTicketsBagTicketBag extends javax.swing.JPanel {
    
    private JTicketsBagTicket m_ticketsbagticket;
    
    /** Creates new form JTicketsBagTicketBag */
    public JTicketsBagTicketBag(JTicketsBagTicket ticketsbagticket) {
        m_ticketsbagticket = ticketsbagticket;
        initComponents();
    }
    
    public void showEdit() {
        showView(StringConstants.getString(StringEnumerates.edit));
    }
    
    public void showRefund() {
        showView(StringConstants.getString(StringEnumerates.refund));
    }
    
    private void showView(String view) {
        CardLayout cl = (CardLayout)(getLayout());
        cl.show(this, view);  
    }    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanEdit = new javax.swing.JPanel();
        m_jBtnDelete = new javax.swing.JButton();
        m_jBtnCancel = new javax.swing.JButton();
        jPanRefund = new javax.swing.JPanel();
        m_jBtnCancel1 = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        jPanEdit.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        m_jBtnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource(StringConstants.getString(StringEnumerates._com_openbravo_images_editdelete_png)))); // NOI18N
        m_jBtnDelete.setText(AppLocal.getIntString(StringConstants.getString(StringEnumerates.Button_DeleteTicket))); // NOI18N
        m_jBtnDelete.setFocusPainted(false);
        m_jBtnDelete.setFocusable(false);
        m_jBtnDelete.setMargin(new java.awt.Insets(8, 14, 8, 14));
        m_jBtnDelete.setRequestFocusEnabled(false);
        m_jBtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_jBtnDeleteActionPerformed(evt);
            }
        });
        jPanEdit.add(m_jBtnDelete);

        m_jBtnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource(StringConstants.getString(StringEnumerates._com_openbravo_images_fileclose_png)))); // NOI18N
        m_jBtnCancel.setText(AppLocal.getIntString(StringConstants.getString(StringEnumerates.Button_Cancel))); // NOI18N
        m_jBtnCancel.setFocusPainted(false);
        m_jBtnCancel.setFocusable(false);
        m_jBtnCancel.setMargin(new java.awt.Insets(8, 14, 8, 14));
        m_jBtnCancel.setRequestFocusEnabled(false);
        m_jBtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_jBtnCancelActionPerformed(evt);
            }
        });
        jPanEdit.add(m_jBtnCancel);

        add(jPanEdit, StringConstants.getString(StringEnumerates.edit));

        jPanRefund.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        m_jBtnCancel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(StringConstants.getString(StringEnumerates._com_openbravo_images_fileclose_png)))); // NOI18N
        m_jBtnCancel1.setText(AppLocal.getIntString(StringConstants.getString(StringEnumerates.Button_Cancel))); // NOI18N
        m_jBtnCancel1.setFocusPainted(false);
        m_jBtnCancel1.setFocusable(false);
        m_jBtnCancel1.setMargin(new java.awt.Insets(8, 14, 8, 14));
        m_jBtnCancel1.setRequestFocusEnabled(false);
        m_jBtnCancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_jBtnCancel1ActionPerformed(evt);
            }
        });
        jPanRefund.add(m_jBtnCancel1);

        add(jPanRefund, StringConstants.getString(StringEnumerates.refund));
    }// </editor-fold>//GEN-END:initComponents

    private void m_jBtnCancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_jBtnCancel1ActionPerformed

        m_ticketsbagticket.canceleditionTicket();

    }//GEN-LAST:event_m_jBtnCancel1ActionPerformed

    private void m_jBtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_jBtnDeleteActionPerformed
        
        int res = JOptionPane.showConfirmDialog(this, AppLocal.getIntString(StringConstants.getString(StringEnumerates.message_wannadelete)), AppLocal.getIntString(StringConstants.getString(StringEnumerates.title_editor)), JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (res == JOptionPane.YES_OPTION) {
            m_ticketsbagticket.deleteTicket();
        }
        
    }//GEN-LAST:event_m_jBtnDeleteActionPerformed

    private void m_jBtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_jBtnCancelActionPerformed

        m_ticketsbagticket.canceleditionTicket();
        
    }//GEN-LAST:event_m_jBtnCancelActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanEdit;
    private javax.swing.JPanel jPanRefund;
    private javax.swing.JButton m_jBtnCancel;
    private javax.swing.JButton m_jBtnCancel1;
    private javax.swing.JButton m_jBtnDelete;
    // End of variables declaration//GEN-END:variables
    
}