package raven.application.form;

import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Color;
import raven.application.Application;


public class LoginForm extends javax.swing.JPanel {

    public LoginForm() {
        initComponents();
        init();
    }

    private void init() {
       
       labelSoftware.putClientProperty(FlatClientProperties.STYLE, "color:black;");

// Nếu bạn muốn thêm thêm các thuộc tính khác, bạn có thể làm như sau
labelSoftware.putClientProperty(FlatClientProperties.STYLE, 
                "color:black; font:$h1.font;");
labelSoftware.setForeground(Color.BLACK);
        lbTitle.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:$h1.font");
        
        txtPass.putClientProperty(FlatClientProperties.STYLE, ""
                + "showRevealButton:true;"
                + "showCapsLock:true");
        cmdLogin.putClientProperty(FlatClientProperties.STYLE, ""
                + "borderWidth:0;"
                + "focusWidth:0");
        txtUser.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "User Name");
        txtPass.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Password");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin1 = new raven.application.form.PanelLogin();
        lbTitle = new javax.swing.JLabel();
        lbUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lbPass = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        cmdLogin = new javax.swing.JButton();
        labelSoftware = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLogin1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Login");
        panelLogin1.add(lbTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 240, -1));

        lbUser.setText("User Name");
        panelLogin1.add(lbUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 66, 240, -1));
        panelLogin1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 89, 240, -1));

        lbPass.setText("Password");
        panelLogin1.add(lbPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 126, 240, -1));
        panelLogin1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 149, 240, -1));

        cmdLogin.setText("Login");
        cmdLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLoginActionPerformed(evt);
            }
        });
        panelLogin1.add(cmdLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 201, 240, -1));

        add(panelLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 320, 300));

        labelSoftware.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelSoftware.setText("Hệ Thống Quản Lý Đặt Phòng Khách Sạn Finder");
        add(labelSoftware, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 390, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/raven/menu/icon/logohotel.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, -1, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/raven/menu/icon/background.png"))); // NOI18N
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(1440, 800));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 790));
    }// </editor-fold>//GEN-END:initComponents

    private void cmdLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLoginActionPerformed
        Application.login();
    }//GEN-LAST:event_cmdLoginActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelSoftware;
    private javax.swing.JLabel lbPass;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbUser;
    private raven.application.form.PanelLogin panelLogin1;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
