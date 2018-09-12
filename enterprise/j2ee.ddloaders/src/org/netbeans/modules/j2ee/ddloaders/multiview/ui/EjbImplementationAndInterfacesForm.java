/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.netbeans.modules.j2ee.ddloaders.multiview.ui;

import org.netbeans.modules.xml.multiview.ui.SectionNodeInnerPanel;
import org.netbeans.modules.xml.multiview.ui.SectionNodeView;

import javax.swing.*;

/**
 * @author pfiala
 */
public class EjbImplementationAndInterfacesForm extends SectionNodeInnerPanel {

    /**
     * Creates new form BeanForm
     */
    public EjbImplementationAndInterfacesForm(SectionNodeView sectionNodeView) {
        super(sectionNodeView);
        initComponents();
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        beanClassTextField = new javax.swing.JTextField();
        localComponentTextField = new javax.swing.JTextField();
        localHomeTextField = new javax.swing.JTextField();
        remoteComponentTextField = new javax.swing.JTextField();
        remoteHomeTextField = new javax.swing.JTextField();
        spacerLabel = new javax.swing.JLabel();
        beanClassLinkButton = new javax.swing.JButton();
        localComponentLinkButton = new javax.swing.JButton();
        localHomeLinkButton = new javax.swing.JButton();
        remoteComponentLinkButton = new javax.swing.JButton();
        remoteHomeLinkButton = new javax.swing.JButton();

        jLabel1.setLabelFor(beanClassTextField);
        jLabel1.setText(org.openide.util.NbBundle.getMessage(EjbImplementationAndInterfacesForm.class, "LBL_BeanClass")); // NOI18N

        jLabel2.setText(org.openide.util.NbBundle.getMessage(EjbImplementationAndInterfacesForm.class, "LBL_LocalInterface")); // NOI18N

        jLabel3.setLabelFor(localComponentTextField);
        jLabel3.setText(org.openide.util.NbBundle.getMessage(EjbImplementationAndInterfacesForm.class, "LBL_Component")); // NOI18N

        jLabel4.setLabelFor(localHomeTextField);
        jLabel4.setText(org.openide.util.NbBundle.getMessage(EjbImplementationAndInterfacesForm.class, "LBL_Home")); // NOI18N

        jLabel5.setText(org.openide.util.NbBundle.getMessage(EjbImplementationAndInterfacesForm.class, "LBL_RemoteInterface")); // NOI18N

        jLabel6.setLabelFor(remoteComponentTextField);
        jLabel6.setText(org.openide.util.NbBundle.getMessage(EjbImplementationAndInterfacesForm.class, "LBL_Component")); // NOI18N

        jLabel7.setLabelFor(remoteHomeTextField);
        jLabel7.setText(org.openide.util.NbBundle.getMessage(EjbImplementationAndInterfacesForm.class, "LBL_Home")); // NOI18N

        beanClassTextField.setColumns(35);

        localComponentTextField.setColumns(35);

        localHomeTextField.setColumns(35);

        remoteComponentTextField.setColumns(35);

        remoteHomeTextField.setColumns(35);

        spacerLabel.setText(" ");

        org.openide.awt.Mnemonics.setLocalizedText(beanClassLinkButton, org.openide.util.NbBundle.getMessage(EjbImplementationAndInterfacesForm.class, "LBL_GoToSource")); // NOI18N
        beanClassLinkButton.setBorderPainted(false);
        beanClassLinkButton.setContentAreaFilled(false);
        beanClassLinkButton.setFocusPainted(false);
        beanClassLinkButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        org.openide.awt.Mnemonics.setLocalizedText(localComponentLinkButton, org.openide.util.NbBundle.getMessage(EjbImplementationAndInterfacesForm.class, "LBL_GoToSource")); // NOI18N
        localComponentLinkButton.setBorderPainted(false);
        localComponentLinkButton.setContentAreaFilled(false);
        localComponentLinkButton.setFocusPainted(false);
        localComponentLinkButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        org.openide.awt.Mnemonics.setLocalizedText(localHomeLinkButton, org.openide.util.NbBundle.getMessage(EjbImplementationAndInterfacesForm.class, "LBL_GoToSource")); // NOI18N
        localHomeLinkButton.setBorderPainted(false);
        localHomeLinkButton.setContentAreaFilled(false);
        localHomeLinkButton.setFocusPainted(false);
        localHomeLinkButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        org.openide.awt.Mnemonics.setLocalizedText(remoteComponentLinkButton, org.openide.util.NbBundle.getMessage(EjbImplementationAndInterfacesForm.class, "LBL_GoToSource")); // NOI18N
        remoteComponentLinkButton.setBorderPainted(false);
        remoteComponentLinkButton.setContentAreaFilled(false);
        remoteComponentLinkButton.setFocusPainted(false);
        remoteComponentLinkButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        org.openide.awt.Mnemonics.setLocalizedText(remoteHomeLinkButton, org.openide.util.NbBundle.getMessage(EjbImplementationAndInterfacesForm.class, "LBL_GoToSource")); // NOI18N
        remoteHomeLinkButton.setBorderPainted(false);
        remoteHomeLinkButton.setContentAreaFilled(false);
        remoteHomeLinkButton.setFocusPainted(false);
        remoteHomeLinkButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(spacerLabel)
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(beanClassTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(beanClassLinkButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(localComponentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(localComponentLinkButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(localHomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(localHomeLinkButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel5))
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(remoteComponentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(remoteComponentLinkButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(remoteHomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(remoteHomeLinkButton))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spacerLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(beanClassTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(beanClassLinkButton)))
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(localComponentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(localComponentLinkButton))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(localHomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(localHomeLinkButton))
                .addGap(7, 7, 7)
                .addComponent(jLabel5)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(remoteComponentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(remoteComponentLinkButton))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(remoteHomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(remoteHomeLinkButton))
                .addContainerGap())
        );

        beanClassTextField.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(EjbImplementationAndInterfacesForm.class, "ACSD_Bean_Class")); // NOI18N
        localComponentTextField.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(EjbImplementationAndInterfacesForm.class, "ACSD_Local_Comp")); // NOI18N
        localHomeTextField.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(EjbImplementationAndInterfacesForm.class, "ACSD_Local_Home")); // NOI18N
        remoteComponentTextField.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(EjbImplementationAndInterfacesForm.class, "ACSD_Remote_Comp")); // NOI18N
        remoteHomeTextField.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(EjbImplementationAndInterfacesForm.class, "ACSD_Remote_Home")); // NOI18N
        beanClassLinkButton.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(EjbImplementationAndInterfacesForm.class, "ACSD_GoToSource")); // NOI18N
        localComponentLinkButton.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(EjbImplementationAndInterfacesForm.class, "ACSD_GoToSource")); // NOI18N
        localHomeLinkButton.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(EjbImplementationAndInterfacesForm.class, "ACSD_GoToSource")); // NOI18N
        remoteComponentLinkButton.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(EjbImplementationAndInterfacesForm.class, "ACSD_GoToSource")); // NOI18N
        remoteHomeLinkButton.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(EjbImplementationAndInterfacesForm.class, "ACSD_GoToSource")); // NOI18N
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton beanClassLinkButton;
    private javax.swing.JTextField beanClassTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton localComponentLinkButton;
    private javax.swing.JTextField localComponentTextField;
    private javax.swing.JButton localHomeLinkButton;
    private javax.swing.JTextField localHomeTextField;
    private javax.swing.JButton remoteComponentLinkButton;
    private javax.swing.JTextField remoteComponentTextField;
    private javax.swing.JButton remoteHomeLinkButton;
    private javax.swing.JTextField remoteHomeTextField;
    private javax.swing.JLabel spacerLabel;
    // End of variables declaration//GEN-END:variables

    public JTextField getBeanClassTextField() {
        return beanClassTextField;
    }

    public JTextField getLocalComponentTextField() {
        return localComponentTextField;
    }

    public JTextField getLocalHomeTextField() {
        return localHomeTextField;
    }

    public JTextField getRemoteComponentTextField() {
        return remoteComponentTextField;
    }

    public JTextField getRemoteHomeTextField() {
        return remoteHomeTextField;
    }

    public JComponent getErrorComponent(String errorId) {
        return null;
    }

    public void setValue(JComponent source, Object value) {

    }

    public void linkButtonPressed(Object ddBean, String ddProperty) {

    }

    public JButton getBeanClassLinkButton() {
        return beanClassLinkButton;
    }

    public JButton getLocalComponentLinkButton() {
        return localComponentLinkButton;
    }

    public JButton getLocalHomeLinkButton() {
        return localHomeLinkButton;
    }

    public JButton getRemoteComponentLinkButton() {
        return remoteComponentLinkButton;
    }

    public JButton getRemoteHomeLinkButton() {
        return remoteHomeLinkButton;
    }
}