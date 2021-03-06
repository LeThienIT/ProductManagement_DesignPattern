/*
 *@Author: AnthonyLe
 */
package ql_sanpham.view;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ql_sanpham.bussiness.Category_function;
import ql_sanpham.bussiness.Product_function;
import ql_sanpham.entity.Category;
import ql_sanpham.entity.Product;
import ql_sanpham.util.CheckProductIdVerify;
import ql_sanpham.util.NumberVerify;
import ql_sanpham.util.StringVerify;

public class Frm_QuanLiSanPham extends javax.swing.JFrame {

    Category_function category_function = new Category_function();
    Product_function product_function = new Product_function();
    Category categorySelected = null;
    DefaultTableModel defaultTableModel = null;
    List<Product> listProduct; // tạo 1 mảng dữ liệu lưu // với table
    Product proSelected = null;

    /**
     * Creates new form Frm_QuanLiSanPham
     */
    public Frm_QuanLiSanPham() {
        initComponents();
//        txtProductId.setInputVerifier(new CheckProductIdVerify(proSelected));   // có lỗi ?????
        // nhập dữ liệu vào ô text sẽ tự động chạy verify tồn tại thì thông báo
        txtProductName.setInputVerifier(new StringVerify());
        txtUnitPrice.setInputVerifier(new NumberVerify());
        txtQuantity.setInputVerifier(new NumberVerify());
        this.setLocationRelativeTo(null);
        loadDataToJList();
        loadDataToCombox();
        loadDateToJTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCategory = new javax.swing.JList<>();
        btnNewCategory = new javax.swing.JButton();
        btnUpdateCategory = new javax.swing.JButton();
        btnDeleteCategory = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        cbCategory = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtProductId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtUnitPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        btnNewProduct = new javax.swing.JButton();
        btnSaveProduct = new javax.swing.JButton();
        btnUpdateProduct = new javax.swing.JButton();
        btnDeleteProduct = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 255));
        jLabel1.setText("QUẢN LÝ ĐỒ VẬT");

        lstCategory.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Danh sách sản phẩm", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(255, 51, 51))); // NOI18N
        lstCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstCategoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstCategory);

        btnNewCategory.setIcon(new javax.swing.ImageIcon("E:\\XAMPP\\Netbeans\\Project\\16.2_QuanLiSanPham\\Upload_Image\\load.png")); // NOI18N
        btnNewCategory.setText("Mới");
        btnNewCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewCategoryActionPerformed(evt);
            }
        });

        btnUpdateCategory.setIcon(new javax.swing.ImageIcon("E:\\XAMPP\\Netbeans\\Project\\16.2_QuanLiSanPham\\Upload_Image\\add.png")); // NOI18N
        btnUpdateCategory.setText("Sửa");
        btnUpdateCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCategoryActionPerformed(evt);
            }
        });

        btnDeleteCategory.setIcon(new javax.swing.ImageIcon("E:\\XAMPP\\Netbeans\\Project\\16.2_QuanLiSanPham\\Upload_Image\\delete.png")); // NOI18N
        btnDeleteCategory.setText("Xóa");
        btnDeleteCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCategoryActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Thông tin chi tiết");

        tblProduct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblProduct);

        jLabel3.setText("Loại sản phẩm");

        cbCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoryActionPerformed(evt);
            }
        });

        jLabel4.setText("Mã sản phẩm");

        jLabel5.setText("Tên sản phẩm");

        jLabel6.setText("Gía sản phẩm");

        jLabel7.setText("Số lượng");

        jLabel8.setText("Ghi chú");

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane3.setViewportView(txtDescription);

        btnNewProduct.setIcon(new javax.swing.ImageIcon("E:\\XAMPP\\Netbeans\\Project\\16.2_QuanLiSanPham\\Upload_Image\\load.png")); // NOI18N
        btnNewProduct.setText("Mới");
        btnNewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewProductActionPerformed(evt);
            }
        });

        btnSaveProduct.setIcon(new javax.swing.ImageIcon("E:\\XAMPP\\Netbeans\\Project\\16.2_QuanLiSanPham\\Upload_Image\\add.png")); // NOI18N
        btnSaveProduct.setText("Lưu");
        btnSaveProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveProductActionPerformed(evt);
            }
        });

        btnUpdateProduct.setIcon(new javax.swing.ImageIcon("E:\\XAMPP\\Netbeans\\Project\\16.2_QuanLiSanPham\\Upload_Image\\update.png")); // NOI18N
        btnUpdateProduct.setText("Sửa");
        btnUpdateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProductActionPerformed(evt);
            }
        });

        btnDeleteProduct.setIcon(new javax.swing.ImageIcon("E:\\XAMPP\\Netbeans\\Project\\16.2_QuanLiSanPham\\Upload_Image\\delete.png")); // NOI18N
        btnDeleteProduct.setText("Xóa");
        btnDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProductActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("(*)");

        jLabel10.setForeground(new java.awt.Color(204, 0, 0));
        jLabel10.setText("(*)");

        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jLabel11.setText("(*)");

        jLabel12.setForeground(new java.awt.Color(204, 0, 0));
        jLabel12.setText("(*)");

        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jLabel13.setText("(*)");

        btnBack.setIcon(new javax.swing.ImageIcon("E:\\XAMPP\\Netbeans\\Project\\16.2_QuanLiSanPham\\Upload_Image\\back.png")); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(357, 357, 357)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btnNewCategory)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdateCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDeleteCategory)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(255, 255, 255)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnNewProduct)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnSaveProduct)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnUpdateProduct)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnDeleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel12)
                                                .addGap(34, 34, 34))
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel13)
                                                    .addComponent(jLabel9)
                                                    .addComponent(jLabel10)
                                                    .addComponent(jLabel11))
                                                .addGap(9, 9, 9)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtUnitPrice, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtProductName, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbCategory, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtProductId, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                                            .addComponent(txtQuantity, javax.swing.GroupLayout.Alignment.LEADING))))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(163, 163, 163)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(98, 98, 98))
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveProduct)
                    .addComponent(btnUpdateProduct)
                    .addComponent(btnDeleteProduct)
                    .addComponent(btnNewProduct))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateCategory)
                    .addComponent(btnDeleteCategory)
                    .addComponent(btnNewCategory))
                .addGap(42, 42, 42))
        );

        jLabel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewCategoryActionPerformed
        // TODO add your handling code here:
        this.dispose(); // ẩn phông cũ và hiện phông mới lên
        new Frm_QuanLiDanhMuc().setVisible(true);
    }//GEN-LAST:event_btnNewCategoryActionPerformed

    private void btnDeleteCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCategoryActionPerformed
        // TODO add your handling code here:
        if (categorySelected != null) {
            // cảnh báo và xác nhận xóa
            int xacNhan = JOptionPane.showConfirmDialog(rootPane, "Bạn thật sự muốn xóa danh mục ( ͡° ͜ʖ ͡°): "
                    + categorySelected.getName() + " ?",
                    "Cảnh báo xóa !!",
                    JOptionPane.YES_NO_OPTION);
            if (xacNhan == 0) {
                if (category_function.delete(categorySelected)) {
                    JOptionPane.showMessageDialog(rootPane, "Xóa thành công");
                    // xóa xong thì load lại danh mục (jlist load lại dữ liệu)
                    loadDataToJList();
                    loadDateToJTable();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Xóa không thành công");
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn phải chọn danh mục để xóa");
        }
    }//GEN-LAST:event_btnDeleteCategoryActionPerformed

    private void btnNewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewProductActionPerformed
        // TODO add your handling code here:
        txtProductId.setText("");
        txtProductName.setText("");
        txtQuantity.setText("");
        txtUnitPrice.setText("");
        txtDescription.setText("");

    }//GEN-LAST:event_btnNewProductActionPerformed

    private void btnUpdateCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCategoryActionPerformed
        // TODO add your handling code here:
        if (categorySelected != null) {
            this.dispose();
            new Frm_QuanLiDanhMuc(categorySelected).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn phải chọn danh mục để sửa");
        }
    }//GEN-LAST:event_btnUpdateCategoryActionPerformed

    private void btnSaveProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveProductActionPerformed
        // TODO add your handling code here:
        int categoryId = ((Category) cbCategory.getSelectedItem()).getId();
        String productId = txtProductId.getText().trim();
        String productName = txtProductName.getText().trim();
        String unitPrice = txtUnitPrice.getText().trim();
        String quantity = txtQuantity.getText().trim();
        String description = txtDescription.getText().trim();

        if (productId.equals("") || productName.equals("")
                || unitPrice.equals("")
                || quantity.equals("")
                || description.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Bạn phải nhập đầy đủ thông tin");
        } else {
            // unitPrice chuyển thành kiểu số nguyên
            // quantity chuyển thành kiểu số nguyên
            float unitPrice1 = Float.parseFloat(unitPrice);
            int quantity1 = Integer.parseInt(quantity);
            // gọi hàm insert
            int idNew = product_function
                    .insert(new Product(0, categoryId, productId, productName, unitPrice1, quantity1, description));
            if (idNew >= 0) {
                this.dispose();
                new Frm_ThongBaoThanhCong().setVisible(true);
//                JOptionPane.showMessageDialog(rootPane, "Thêm mới sản phẩm thành công");
                // thêm vào table
                loadDateToJTable();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Thêm mới sản phẩm thất bại!!!!");
            }
        }
    }//GEN-LAST:event_btnSaveProductActionPerformed

    private void btnUpdateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateProductActionPerformed
        // TODO add your handling code here:
        int categoryId = ((Category) cbCategory.getSelectedItem()).getId();
        String productId = txtProductId.getText().trim();
        String productName = txtProductName.getText().trim();
        String unitPrice = txtUnitPrice.getText().trim();
        String quantity = txtQuantity.getText().trim();
        String description = txtDescription.getText().trim();
        if (productId.equals("")
                || productName.equals("")
                || unitPrice.equals("")
                || quantity.equals("")
                || description.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Bạn phải nhập đầy đủ thông tin");
        } else {
            // unitPrice chuyển thành kiểu số nguyên
            // quantity chuyển thành kiểu số nguyên
            float unitPrice1 = Float.parseFloat(unitPrice);
            int quantity1 = Integer.parseInt(quantity);
            // gọi hàm update
            boolean isUpdate = product_function
                    .update(new Product(proSelected.getId(), categoryId, productId, productName, unitPrice1, quantity1, description));
            if (isUpdate) {
                JOptionPane.showMessageDialog(rootPane, "Sửa sản phẩm thành công");
                // thêm vào table
                loadDateToJTable();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Sửa sản phẩm thất bại!!!!");
            }
        }
    }//GEN-LAST:event_btnUpdateProductActionPerformed

    private void btnDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProductActionPerformed
        // TODO add your handling code here:        
        if (JOptionPane.showConfirmDialog(rootPane, "Bạn thật sự muốn xóa ( ͡° ͜ʖ ͡°) ?", "Cảnh báo xóa !!", JOptionPane.YES_NO_OPTION) != 0) {
        } else {
            boolean isDelete = product_function.delete(proSelected);
            if (isDelete) {
                // gọi hàm delete
                JOptionPane.showMessageDialog(rootPane, "Xóa sản phẩm thành công");
                // thêm vào table
                loadDateToJTable();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Xóa sản phẩm thất bại!!!!");
            }
        }
    }//GEN-LAST:event_btnDeleteProductActionPerformed

    private void lstCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstCategoryMouseClicked
        // TODO add your handling code here:
        // lấy đối  tượng muốn kick
        categorySelected = lstCategory.getSelectedValue(); // trả về 1 category
//        System.out.println(category);


    }//GEN-LAST:event_lstCategoryMouseClicked

    private void tblProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductMouseClicked
        // TODO add your handling code here:
        // gán sự kiện mouseClick -> index và đối tượng
        int rowSelected = tblProduct.getSelectedRow();
//        System.out.println(rowSelected);
//        System.out.println(listProduct.get(rowSelected));
        proSelected = listProduct.get(rowSelected);
//        txtProductId.setInputVerifier(new CheckProductIdVerify(proSelected)); // set lai product sẽ không bị null
        categorySelected = category_function.get(proSelected.getCategoryid()).get();
        // gọi lai hàm loadData
        loadDataToCombox();
        txtProductId.setText(proSelected.getProductid());
        txtProductName.setText(proSelected.getName());
        txtUnitPrice.setText(String.valueOf(proSelected.getUnitPrice()));
        txtQuantity.setText(String.valueOf(proSelected.getQuantity()));
        txtDescription.setText(proSelected.getDescription());

    }//GEN-LAST:event_tblProductMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Frm_QuanLiNguoiDung().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cbCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCategoryActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_QuanLiSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_QuanLiSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_QuanLiSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_QuanLiSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_QuanLiSanPham().setDefaultCloseOperation(EXIT_ON_CLOSE);
                new Frm_QuanLiSanPham().setSize(700, 600);
                new Frm_QuanLiSanPham().setMinimumSize(new Dimension(700, 0));
                new Frm_QuanLiSanPham().setMaximumSize(new Dimension(600, Integer.MAX_VALUE));
                new Frm_QuanLiSanPham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteCategory;
    private javax.swing.JButton btnDeleteProduct;
    private javax.swing.JButton btnNewCategory;
    private javax.swing.JButton btnNewProduct;
    private javax.swing.JButton btnSaveProduct;
    private javax.swing.JButton btnUpdateCategory;
    private javax.swing.JButton btnUpdateProduct;
    private javax.swing.JComboBox<Category> cbCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<Category> lstCategory;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtProductId;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtUnitPrice;
    // End of variables declaration//GEN-END:variables

    private void loadDataToJList() {
        DefaultListModel<Category> defaultListModel = new DefaultListModel<>();
        List<Category> listCategorys1 = category_function.getAll();
        for (Category category : listCategorys1) {
            defaultListModel.addElement(category);
        }
        lstCategory.setModel(defaultListModel);

    }

    private void loadDataToCombox() {
        DefaultComboBoxModel<Category> defaultComboBoxModel = new DefaultComboBoxModel<>();
        List<Category> listCategorys2 = category_function.getAll();
        for (Category category : listCategorys2) {
            if (categorySelected != null && categorySelected.getId() == category.getId()) {
                // 2 bằng nhau xét đối tượng bên dưới
                defaultComboBoxModel.setSelectedItem(categorySelected);
            }
            defaultComboBoxModel.addElement(category);
        }
        cbCategory.setModel(defaultComboBoxModel);
    }

    private void loadDateToJTable() {
        defaultTableModel = new DefaultTableModel();
        Object[] columnTitle = {"Category Name", "Product Id", "Product Name", "Unit Price", "Quantity", "Description"};
        defaultTableModel.setColumnIdentifiers(columnTitle);
        listProduct = product_function.getAll();
        Object[] rowData = null;
        String nameCategory = "";
        for (Product product : listProduct) {
            nameCategory = category_function.get(product.getCategoryid()).get().getName();
            rowData = new Object[]{nameCategory, product.getProductid(),
                product.getName(),
                String.format("%.0f", product.getUnitPrice()) // format tiền, định dạng lại
                ,
                 product.getQuantity(),
                product.getDescription()};
            defaultTableModel.addRow(rowData);
        }
        tblProduct.setModel(defaultTableModel);
    }
}
