package vn.thangloi.webbansach_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "hinh_thuc_giao_hang")
public class HinhThucGiaoHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_hinh_thuc_giao_hang")
    private int maHinhThucGiaoHang;

    @Column(name = "ten_hinh_thuc_giao_hang")
    private String tenHinhThucGiaoHang;

    @Column(name = "mo_ta")
    private String moTa;

    @Column(name = "chi_phi_giao_hang")
    private double chiPhiGiaoHang;

    @OneToMany(mappedBy = "hinhThucGiaoHang", fetch = FetchType.LAZY, cascade = {
            CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH,
    })
    private List<DonHang> danhSachDonHang;
}
