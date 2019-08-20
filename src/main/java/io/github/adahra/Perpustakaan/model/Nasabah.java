/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.adahra.Perpustakaan.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sebangsa
 */
@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nasabah.findAll", query = "SELECT n FROM Nasabah n"),
    @NamedQuery(name = "Nasabah.findByNasabahId", query = "SELECT n FROM Nasabah n WHERE n.nasabahId = :nasabahId"),
    @NamedQuery(name = "Nasabah.findByNamaNasabah", query = "SELECT n FROM Nasabah n WHERE n.namaNasabah = :namaNasabah"),
    @NamedQuery(name = "Nasabah.findByAlamat", query = "SELECT n FROM Nasabah n WHERE n.alamat = :alamat"),
    @NamedQuery(name = "Nasabah.findByTelpon", query = "SELECT n FROM Nasabah n WHERE n.telpon = :telpon"),
    @NamedQuery(name = "Nasabah.findByJenisKelamin", query = "SELECT n FROM Nasabah n WHERE n.jenisKelamin = :jenisKelamin"),
    @NamedQuery(name = "Nasabah.findByPekerjaan", query = "SELECT n FROM Nasabah n WHERE n.pekerjaan = :pekerjaan"),
    @NamedQuery(name = "Nasabah.findByTempatlahir", query = "SELECT n FROM Nasabah n WHERE n.tempatlahir = :tempatlahir"),
    @NamedQuery(name = "Nasabah.findByTgllahir", query = "SELECT n FROM Nasabah n WHERE n.tgllahir = :tgllahir"),
    @NamedQuery(name = "Nasabah.findByGelarId", query = "SELECT n FROM Nasabah n WHERE n.gelarId = :gelarId"),
    @NamedQuery(name = "Nasabah.findByJenisId", query = "SELECT n FROM Nasabah n WHERE n.jenisId = :jenisId"),
    @NamedQuery(name = "Nasabah.findByNoId", query = "SELECT n FROM Nasabah n WHERE n.noId = :noId"),
    @NamedQuery(name = "Nasabah.findByKeterangan", query = "SELECT n FROM Nasabah n WHERE n.keterangan = :keterangan"),
    @NamedQuery(name = "Nasabah.findByNasabahGroup1", query = "SELECT n FROM Nasabah n WHERE n.nasabahGroup1 = :nasabahGroup1"),
    @NamedQuery(name = "Nasabah.findByNasabahGroup2", query = "SELECT n FROM Nasabah n WHERE n.nasabahGroup2 = :nasabahGroup2"),
    @NamedQuery(name = "Nasabah.findByNasabahGroup3", query = "SELECT n FROM Nasabah n WHERE n.nasabahGroup3 = :nasabahGroup3"),
    @NamedQuery(name = "Nasabah.findByNasabahGroup4", query = "SELECT n FROM Nasabah n WHERE n.nasabahGroup4 = :nasabahGroup4"),
    @NamedQuery(name = "Nasabah.findByKota", query = "SELECT n FROM Nasabah n WHERE n.kota = :kota"),
    @NamedQuery(name = "Nasabah.findByNamaKuasa", query = "SELECT n FROM Nasabah n WHERE n.namaKuasa = :namaKuasa"),
    @NamedQuery(name = "Nasabah.findByAlamatKuasa", query = "SELECT n FROM Nasabah n WHERE n.alamatKuasa = :alamatKuasa"),
    @NamedQuery(name = "Nasabah.findByPekerjaanKuasa", query = "SELECT n FROM Nasabah n WHERE n.pekerjaanKuasa = :pekerjaanKuasa"),
    @NamedQuery(name = "Nasabah.findByTgllahirKuasa", query = "SELECT n FROM Nasabah n WHERE n.tgllahirKuasa = :tgllahirKuasa"),
    @NamedQuery(name = "Nasabah.findByNoDin", query = "SELECT n FROM Nasabah n WHERE n.noDin = :noDin"),
    @NamedQuery(name = "Nasabah.findByNamaAlias", query = "SELECT n FROM Nasabah n WHERE n.namaAlias = :namaAlias"),
    @NamedQuery(name = "Nasabah.findByNpwp", query = "SELECT n FROM Nasabah n WHERE n.npwp = :npwp"),
    @NamedQuery(name = "Nasabah.findByNama1Nasabah", query = "SELECT n FROM Nasabah n WHERE n.nama1Nasabah = :nama1Nasabah"),
    @NamedQuery(name = "Nasabah.findByNama2Nasabah", query = "SELECT n FROM Nasabah n WHERE n.nama2Nasabah = :nama2Nasabah"),
    @NamedQuery(name = "Nasabah.findByNama3Nasabah", query = "SELECT n FROM Nasabah n WHERE n.nama3Nasabah = :nama3Nasabah"),
    @NamedQuery(name = "Nasabah.findByNama4Nasabah", query = "SELECT n FROM Nasabah n WHERE n.nama4Nasabah = :nama4Nasabah"),
    @NamedQuery(name = "Nasabah.findByKecamatan", query = "SELECT n FROM Nasabah n WHERE n.kecamatan = :kecamatan"),
    @NamedQuery(name = "Nasabah.findByKodePos", query = "SELECT n FROM Nasabah n WHERE n.kodePos = :kodePos"),
    @NamedQuery(name = "Nasabah.findByKotaId", query = "SELECT n FROM Nasabah n WHERE n.kotaId = :kotaId"),
    @NamedQuery(name = "Nasabah.findByKelurahan", query = "SELECT n FROM Nasabah n WHERE n.kelurahan = :kelurahan"),
    @NamedQuery(name = "Nasabah.findByJenisNasabah", query = "SELECT n FROM Nasabah n WHERE n.jenisNasabah = :jenisNasabah"),
    @NamedQuery(name = "Nasabah.findByNoPaspor", query = "SELECT n FROM Nasabah n WHERE n.noPaspor = :noPaspor"),
    @NamedQuery(name = "Nasabah.findByNoAkteAkhir", query = "SELECT n FROM Nasabah n WHERE n.noAkteAkhir = :noAkteAkhir"),
    @NamedQuery(name = "Nasabah.findByTglAkteAkhir", query = "SELECT n FROM Nasabah n WHERE n.tglAkteAkhir = :tglAkteAkhir"),
    @NamedQuery(name = "Nasabah.findByKodeNegara", query = "SELECT n FROM Nasabah n WHERE n.kodeNegara = :kodeNegara"),
    @NamedQuery(name = "Nasabah.findByKodeArea", query = "SELECT n FROM Nasabah n WHERE n.kodeArea = :kodeArea"),
    @NamedQuery(name = "Nasabah.findByPekerjaanId", query = "SELECT n FROM Nasabah n WHERE n.pekerjaanId = :pekerjaanId"),
    @NamedQuery(name = "Nasabah.findByAkumJasaPinj", query = "SELECT n FROM Nasabah n WHERE n.akumJasaPinj = :akumJasaPinj"),
    @NamedQuery(name = "Nasabah.findByIndexShuPinj", query = "SELECT n FROM Nasabah n WHERE n.indexShuPinj = :indexShuPinj"),
    @NamedQuery(name = "Nasabah.findByShuPinj", query = "SELECT n FROM Nasabah n WHERE n.shuPinj = :shuPinj"),
    @NamedQuery(name = "Nasabah.findByAkumSimp", query = "SELECT n FROM Nasabah n WHERE n.akumSimp = :akumSimp"),
    @NamedQuery(name = "Nasabah.findByIndexShuSimp", query = "SELECT n FROM Nasabah n WHERE n.indexShuSimp = :indexShuSimp"),
    @NamedQuery(name = "Nasabah.findByShuSimp", query = "SELECT n FROM Nasabah n WHERE n.shuSimp = :shuSimp"),
    @NamedQuery(name = "Nasabah.findByIbuKandung", query = "SELECT n FROM Nasabah n WHERE n.ibuKandung = :ibuKandung"),
    @NamedQuery(name = "Nasabah.findByKetGelar", query = "SELECT n FROM Nasabah n WHERE n.ketGelar = :ketGelar"),
    @NamedQuery(name = "Nasabah.findByKodeGolonganDebitur", query = "SELECT n FROM Nasabah n WHERE n.kodeGolonganDebitur = :kodeGolonganDebitur"),
    @NamedQuery(name = "Nasabah.findByTempatKerja", query = "SELECT n FROM Nasabah n WHERE n.tempatKerja = :tempatKerja"),
    @NamedQuery(name = "Nasabah.findByKodeBidangUsaha", query = "SELECT n FROM Nasabah n WHERE n.kodeBidangUsaha = :kodeBidangUsaha"),
    @NamedQuery(name = "Nasabah.findByKodeHubunganDebitur", query = "SELECT n FROM Nasabah n WHERE n.kodeHubunganDebitur = :kodeHubunganDebitur"),
    @NamedQuery(name = "Nasabah.findByPathFoto", query = "SELECT n FROM Nasabah n WHERE n.pathFoto = :pathFoto"),
    @NamedQuery(name = "Nasabah.findByPathTtangan", query = "SELECT n FROM Nasabah n WHERE n.pathTtangan = :pathTtangan"),
    @NamedQuery(name = "Nasabah.findByNoRekShu", query = "SELECT n FROM Nasabah n WHERE n.noRekShu = :noRekShu"),
    @NamedQuery(name = "Nasabah.findByAnggota", query = "SELECT n FROM Nasabah n WHERE n.anggota = :anggota"),
    @NamedQuery(name = "Nasabah.findByNoNip", query = "SELECT n FROM Nasabah n WHERE n.noNip = :noNip"),
    @NamedQuery(name = "Nasabah.findByTglid", query = "SELECT n FROM Nasabah n WHERE n.tglid = :tglid"),
    @NamedQuery(name = "Nasabah.findByBlackList", query = "SELECT n FROM Nasabah n WHERE n.blackList = :blackList"),
    @NamedQuery(name = "Nasabah.findByTujuanPembukaanKyc", query = "SELECT n FROM Nasabah n WHERE n.tujuanPembukaanKyc = :tujuanPembukaanKyc"),
    @NamedQuery(name = "Nasabah.findBySumberDanaKyc", query = "SELECT n FROM Nasabah n WHERE n.sumberDanaKyc = :sumberDanaKyc"),
    @NamedQuery(name = "Nasabah.findByPenggunaanDanaKyc", query = "SELECT n FROM Nasabah n WHERE n.penggunaanDanaKyc = :penggunaanDanaKyc"),
    @NamedQuery(name = "Nasabah.findByKetPekerjaan", query = "SELECT n FROM Nasabah n WHERE n.ketPekerjaan = :ketPekerjaan"),
    @NamedQuery(name = "Nasabah.findByTanggalUlangtahun", query = "SELECT n FROM Nasabah n WHERE n.tanggalUlangtahun = :tanggalUlangtahun"),
    @NamedQuery(name = "Nasabah.findByBulanUlangtahun", query = "SELECT n FROM Nasabah n WHERE n.bulanUlangtahun = :bulanUlangtahun"),
    @NamedQuery(name = "Nasabah.findByTglBuka", query = "SELECT n FROM Nasabah n WHERE n.tglBuka = :tglBuka"),
    @NamedQuery(name = "Nasabah.findByPendapatanKyc", query = "SELECT n FROM Nasabah n WHERE n.pendapatanKyc = :pendapatanKyc"),
    @NamedQuery(name = "Nasabah.findByAlamatDomisili", query = "SELECT n FROM Nasabah n WHERE n.alamatDomisili = :alamatDomisili"),
    @NamedQuery(name = "Nasabah.findByNoHp", query = "SELECT n FROM Nasabah n WHERE n.noHp = :noHp"),
    @NamedQuery(name = "Nasabah.findByKawin", query = "SELECT n FROM Nasabah n WHERE n.kawin = :kawin"),
    @NamedQuery(name = "Nasabah.findByNoSuratNikah", query = "SELECT n FROM Nasabah n WHERE n.noSuratNikah = :noSuratNikah"),
    @NamedQuery(name = "Nasabah.findByNoKk", query = "SELECT n FROM Nasabah n WHERE n.noKk = :noKk"),
    @NamedQuery(name = "Nasabah.findByIddebitur", query = "SELECT n FROM Nasabah n WHERE n.iddebitur = :iddebitur"),
    @NamedQuery(name = "Nasabah.findByFlagKirim", query = "SELECT n FROM Nasabah n WHERE n.flagKirim = :flagKirim"),
    @NamedQuery(name = "Nasabah.findByCab", query = "SELECT n FROM Nasabah n WHERE n.cab = :cab"),
    @NamedQuery(name = "Nasabah.findByNamaSID", query = "SELECT n FROM Nasabah n WHERE n.namaSID = :namaSID"),
    @NamedQuery(name = "Nasabah.findByResikoNasabah", query = "SELECT n FROM Nasabah n WHERE n.resikoNasabah = :resikoNasabah"),
    @NamedQuery(name = "Nasabah.findByKotaIdSid", query = "SELECT n FROM Nasabah n WHERE n.kotaIdSid = :kotaIdSid"),
    @NamedQuery(name = "Nasabah.findByUserapp", query = "SELECT n FROM Nasabah n WHERE n.userapp = :userapp"),
    @NamedQuery(name = "Nasabah.findByTglApp", query = "SELECT n FROM Nasabah n WHERE n.tglApp = :tglApp"),
    @NamedQuery(name = "Nasabah.findByEmail", query = "SELECT n FROM Nasabah n WHERE n.email = :email"),
    @NamedQuery(name = "Nasabah.findByMaxPlafon", query = "SELECT n FROM Nasabah n WHERE n.maxPlafon = :maxPlafon"),
    @NamedQuery(name = "Nasabah.findByAlamatBekerja", query = "SELECT n FROM Nasabah n WHERE n.alamatBekerja = :alamatBekerja"),
    @NamedQuery(name = "Nasabah.findByKodeSumberDana", query = "SELECT n FROM Nasabah n WHERE n.kodeSumberDana = :kodeSumberDana"),
    @NamedQuery(name = "Nasabah.findByJmlTanggungan", query = "SELECT n FROM Nasabah n WHERE n.jmlTanggungan = :jmlTanggungan"),
    @NamedQuery(name = "Nasabah.findByPisahHarta", query = "SELECT n FROM Nasabah n WHERE n.pisahHarta = :pisahHarta"),
    @NamedQuery(name = "Nasabah.findByPengurus1", query = "SELECT n FROM Nasabah n WHERE n.pengurus1 = :pengurus1"),
    @NamedQuery(name = "Nasabah.findByPersenPengurus1", query = "SELECT n FROM Nasabah n WHERE n.persenPengurus1 = :persenPengurus1"),
    @NamedQuery(name = "Nasabah.findByNasabahGroup5", query = "SELECT n FROM Nasabah n WHERE n.nasabahGroup5 = :nasabahGroup5"),
    @NamedQuery(name = "Nasabah.findByKtpPengurus1", query = "SELECT n FROM Nasabah n WHERE n.ktpPengurus1 = :ktpPengurus1"),
    @NamedQuery(name = "Nasabah.findByPengurus2", query = "SELECT n FROM Nasabah n WHERE n.pengurus2 = :pengurus2"),
    @NamedQuery(name = "Nasabah.findByPersenPengurus2", query = "SELECT n FROM Nasabah n WHERE n.persenPengurus2 = :persenPengurus2"),
    @NamedQuery(name = "Nasabah.findByNasabahGroup6", query = "SELECT n FROM Nasabah n WHERE n.nasabahGroup6 = :nasabahGroup6"),
    @NamedQuery(name = "Nasabah.findByKtpPengurus2", query = "SELECT n FROM Nasabah n WHERE n.ktpPengurus2 = :ktpPengurus2"),
    @NamedQuery(name = "Nasabah.findByIDslik", query = "SELECT n FROM Nasabah n WHERE n.iDslik = :iDslik"),
    @NamedQuery(name = "Nasabah.findByAlamatPengurus1", query = "SELECT n FROM Nasabah n WHERE n.alamatPengurus1 = :alamatPengurus1"),
    @NamedQuery(name = "Nasabah.findByAlamatPengurus2", query = "SELECT n FROM Nasabah n WHERE n.alamatPengurus2 = :alamatPengurus2"),
    @NamedQuery(name = "Nasabah.findByKtpPengurus3", query = "SELECT n FROM Nasabah n WHERE n.ktpPengurus3 = :ktpPengurus3"),
    @NamedQuery(name = "Nasabah.findByPengurus3", query = "SELECT n FROM Nasabah n WHERE n.pengurus3 = :pengurus3"),
    @NamedQuery(name = "Nasabah.findByPersenPengurus3", query = "SELECT n FROM Nasabah n WHERE n.persenPengurus3 = :persenPengurus3"),
    @NamedQuery(name = "Nasabah.findByNasabahGroup7", query = "SELECT n FROM Nasabah n WHERE n.nasabahGroup7 = :nasabahGroup7"),
    @NamedQuery(name = "Nasabah.findByAlamatPengurus3", query = "SELECT n FROM Nasabah n WHERE n.alamatPengurus3 = :alamatPengurus3"),
    @NamedQuery(name = "Nasabah.findByKodeKas", query = "SELECT n FROM Nasabah n WHERE n.kodeKas = :kodeKas"),
    @NamedQuery(name = "Nasabah.findByStatusApproval", query = "SELECT n FROM Nasabah n WHERE n.statusApproval = :statusApproval"),
    @NamedQuery(name = "Nasabah.findByUserApproval", query = "SELECT n FROM Nasabah n WHERE n.userApproval = :userApproval"),
    @NamedQuery(name = "Nasabah.findByUserid", query = "SELECT n FROM Nasabah n WHERE n.userid = :userid"),
    @NamedQuery(name = "Nasabah.findByLinkNasabahId", query = "SELECT n FROM Nasabah n WHERE n.linkNasabahId = :linkNasabahId"),
    @NamedQuery(name = "Nasabah.findByTglPengkinianNas", query = "SELECT n FROM Nasabah n WHERE n.tglPengkinianNas = :tglPengkinianNas")})
public class Nasabah implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "nasabah_id", nullable = false, length = 60)
    private String nasabahId;
    @Size(max = 150)
    @Column(name = "NAMA_NASABAH", length = 150)
    private String namaNasabah;
    @Size(max = 300)
    @Column(length = 300)
    private String alamat;
    @Size(max = 45)
    @Column(length = 45)
    private String telpon;
    @Size(max = 6)
    @Column(name = "jenis_kelamin", length = 6)
    private String jenisKelamin;
    @Size(max = 105)
    @Column(length = 105)
    private String pekerjaan;
    @Size(max = 150)
    @Column(length = 150)
    private String tempatlahir;
    @Temporal(TemporalType.DATE)
    private Date tgllahir;
    @Size(max = 12)
    @Column(name = "gelar_id", length = 12)
    private String gelarId;
    @Size(max = 3)
    @Column(name = "jenis_id", length = 3)
    private String jenisId;
    @Size(max = 90)
    @Column(name = "no_id", length = 90)
    private String noId;
    @Size(max = 150)
    @Column(length = 150)
    private String keterangan;
    @Size(max = 9)
    @Column(name = "NASABAH_GROUP1", length = 9)
    private String nasabahGroup1;
    @Size(max = 9)
    @Column(name = "NASABAH_GROUP2", length = 9)
    private String nasabahGroup2;
    @Size(max = 9)
    @Column(name = "NASABAH_GROUP3", length = 9)
    private String nasabahGroup3;
    @Size(max = 12)
    @Column(name = "NASABAH_GROUP4", length = 12)
    private String nasabahGroup4;
    @Size(max = 60)
    @Column(length = 60)
    private String kota;
    @Size(max = 105)
    @Column(name = "NAMA_KUASA", length = 105)
    private String namaKuasa;
    @Size(max = 120)
    @Column(name = "ALAMAT_KUASA", length = 120)
    private String alamatKuasa;
    @Size(max = 105)
    @Column(name = "PEKERJAAN_KUASA", length = 105)
    private String pekerjaanKuasa;
    @Column(name = "TGLLAHIR_KUASA")
    @Temporal(TemporalType.DATE)
    private Date tgllahirKuasa;
    @Size(max = 60)
    @Column(name = "NO_DIN", length = 60)
    private String noDin;
    @Size(max = 150)
    @Column(name = "NAMA_ALIAS", length = 150)
    private String namaAlias;
    @Size(max = 60)
    @Column(length = 60)
    private String npwp;
    @Size(max = 75)
    @Column(name = "NAMA1_NASABAH", length = 75)
    private String nama1Nasabah;
    @Size(max = 75)
    @Column(name = "NAMA2_NASABAH", length = 75)
    private String nama2Nasabah;
    @Size(max = 75)
    @Column(name = "NAMA3_NASABAH", length = 75)
    private String nama3Nasabah;
    @Size(max = 75)
    @Column(name = "NAMA4_NASABAH", length = 75)
    private String nama4Nasabah;
    @Size(max = 150)
    @Column(length = 150)
    private String kecamatan;
    @Size(max = 15)
    @Column(name = "kode_pos", length = 15)
    private String kodePos;
    @Size(max = 12)
    @Column(name = "kota_id", length = 12)
    private String kotaId;
    @Size(max = 150)
    @Column(length = 150)
    private String kelurahan;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "JENIS_NASABAH", precision = 22, scale = 0)
    private Double jenisNasabah;
    @Size(max = 90)
    @Column(name = "NO_PASPOR", length = 90)
    private String noPaspor;
    @Size(max = 90)
    @Column(name = "NO_AKTE_AKHIR", length = 90)
    private String noAkteAkhir;
    @Column(name = "TGL_AKTE_AKHIR")
    @Temporal(TemporalType.DATE)
    private Date tglAkteAkhir;
    @Size(max = 9)
    @Column(name = "KODE_NEGARA", length = 9)
    private String kodeNegara;
    @Size(max = 12)
    @Column(name = "KODE_AREA", length = 12)
    private String kodeArea;
    @Size(max = 9)
    @Column(name = "pekerjaan_id", length = 9)
    private String pekerjaanId;
    @Column(name = "AKUM_JASA_PINJ")
    private Long akumJasaPinj;
    @Column(name = "INDEX_SHU_PINJ")
    private Long indexShuPinj;
    @Column(name = "SHU_PINJ")
    private Long shuPinj;
    @Column(name = "AKUM_SIMP")
    private Long akumSimp;
    @Column(name = "INDEX_SHU_SIMP")
    private Long indexShuSimp;
    @Column(name = "SHU_SIMP")
    private Long shuSimp;
    @Size(max = 90)
    @Column(name = "IBU_KANDUNG", length = 90)
    private String ibuKandung;
    @Size(max = 90)
    @Column(name = "KET_GELAR", length = 90)
    private String ketGelar;
    @Size(max = 9)
    @Column(name = "kode_golongan_debitur", length = 9)
    private String kodeGolonganDebitur;
    @Size(max = 150)
    @Column(name = "Tempat_Kerja", length = 150)
    private String tempatKerja;
    @Size(max = 15)
    @Column(name = "Kode_Bidang_Usaha", length = 15)
    private String kodeBidangUsaha;
    @Size(max = 12)
    @Column(name = "Kode_Hubungan_Debitur", length = 12)
    private String kodeHubunganDebitur;
    @Size(max = 450)
    @Column(name = "PATH_FOTO", length = 450)
    private String pathFoto;
    @Size(max = 450)
    @Column(name = "PATH_TTANGAN", length = 450)
    private String pathTtangan;
    @Size(max = 60)
    @Column(name = "NO_REK_SHU", length = 60)
    private String noRekShu;
    private Boolean anggota;
    @Size(max = 90)
    @Column(name = "NO_NIP", length = 90)
    private String noNip;
    @Temporal(TemporalType.DATE)
    private Date tglid;
    @Column(name = "Black_List")
    private Short blackList;
    @Size(max = 150)
    @Column(name = "TUJUAN_PEMBUKAAN_KYC", length = 150)
    private String tujuanPembukaanKyc;
    @Size(max = 150)
    @Column(name = "SUMBER_DANA_KYC", length = 150)
    private String sumberDanaKyc;
    @Size(max = 150)
    @Column(name = "PENGGUNAAN_DANA_KYC", length = 150)
    private String penggunaanDanaKyc;
    @Size(max = 150)
    @Column(name = "KET_PEKERJAAN", length = 150)
    private String ketPekerjaan;
    @Column(name = "TANGGAL_ULANGTAHUN", precision = 22, scale = 0)
    private Double tanggalUlangtahun;
    @Column(name = "BULAN_ULANGTAHUN", precision = 22, scale = 0)
    private Double bulanUlangtahun;
    @Column(name = "TGL_BUKA")
    @Temporal(TemporalType.DATE)
    private Date tglBuka;
    @Column(name = "PENDAPATAN_KYC")
    private Long pendapatanKyc;
    @Size(max = 300)
    @Column(name = "ALAMAT_DOMISILI", length = 300)
    private String alamatDomisili;
    @Size(max = 90)
    @Column(name = "NO_HP", length = 90)
    private String noHp;
    private Boolean kawin;
    @Size(max = 150)
    @Column(name = "no_surat_nikah", length = 150)
    private String noSuratNikah;
    @Size(max = 90)
    @Column(name = "no_kk", length = 90)
    private String noKk;
    @Size(max = 135)
    @Column(length = 135)
    private String iddebitur;
    @Size(max = 3)
    @Column(name = "flag_kirim", length = 3)
    private String flagKirim;
    @Size(max = 9)
    @Column(length = 9)
    private String cab;
    @Size(max = 150)
    @Column(name = "nama_SID", length = 150)
    private String namaSID;
    @Size(max = 30)
    @Column(name = "resiko_nasabah", length = 30)
    private String resikoNasabah;
    @Size(max = 12)
    @Column(name = "kota_id_sid", length = 12)
    private String kotaIdSid;
    @Column(precision = 22, scale = 0)
    private Double userapp;
    @Temporal(TemporalType.DATE)
    private Date tglApp;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 150)
    @Column(length = 150)
    private String email;
    @Column(name = "Max_Plafon")
    private Long maxPlafon;
    @Size(max = 150)
    @Column(name = "alamat_bekerja", length = 150)
    private String alamatBekerja;
    @Column(name = "kode_sumber_dana")
    private Short kodeSumberDana;
    @Column(name = "jml_tanggungan")
    private Short jmlTanggungan;
    @Size(max = 3)
    @Column(name = "pisah_harta", length = 3)
    private String pisahHarta;
    @Size(max = 150)
    @Column(length = 150)
    private String pengurus1;
    @Column(name = "persen_pengurus1")
    private Long persenPengurus1;
    @Size(max = 6)
    @Column(name = "NASABAH_GROUP5", length = 6)
    private String nasabahGroup5;
    @Size(max = 60)
    @Column(name = "ktp_pengurus1", length = 60)
    private String ktpPengurus1;
    @Size(max = 150)
    @Column(length = 150)
    private String pengurus2;
    @Column(name = "persen_pengurus2")
    private Long persenPengurus2;
    @Size(max = 6)
    @Column(name = "NASABAH_GROUP6", length = 6)
    private String nasabahGroup6;
    @Size(max = 60)
    @Column(name = "ktp_pengurus2", length = 60)
    private String ktpPengurus2;
    @Size(max = 12)
    @Column(length = 12)
    private String iDslik;
    @Size(max = 150)
    @Column(name = "alamat_pengurus1", length = 150)
    private String alamatPengurus1;
    @Size(max = 150)
    @Column(name = "alamat_pengurus2", length = 150)
    private String alamatPengurus2;
    @Size(max = 60)
    @Column(name = "ktp_pengurus3", length = 60)
    private String ktpPengurus3;
    @Size(max = 150)
    @Column(length = 150)
    private String pengurus3;
    @Column(name = "persen_pengurus3")
    private Long persenPengurus3;
    @Size(max = 6)
    @Column(name = "NASABAH_GROUP7", length = 6)
    private String nasabahGroup7;
    @Size(max = 150)
    @Column(name = "alamat_pengurus3", length = 150)
    private String alamatPengurus3;
    @Size(max = 9)
    @Column(name = "kode_kas", length = 9)
    private String kodeKas;
    @Column(name = "status_approval", precision = 22, scale = 0)
    private Double statusApproval;
    @Column(name = "user_approval", precision = 22, scale = 0)
    private Double userApproval;
    @Column(precision = 22, scale = 0)
    private Double userid;
    @Size(max = 60)
    @Column(name = "link_nasabah_id", length = 60)
    private String linkNasabahId;
    @Column(name = "tgl_pengkinian_nas")
    @Temporal(TemporalType.DATE)
    private Date tglPengkinianNas;

    public Nasabah() {
    }

    public Nasabah(String nasabahId) {
        this.nasabahId = nasabahId;
    }

    public String getNasabahId() {
        return nasabahId;
    }

    public void setNasabahId(String nasabahId) {
        this.nasabahId = nasabahId;
    }

    public String getNamaNasabah() {
        return namaNasabah;
    }

    public void setNamaNasabah(String namaNasabah) {
        this.namaNasabah = namaNasabah;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelpon() {
        return telpon;
    }

    public void setTelpon(String telpon) {
        this.telpon = telpon;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getTempatlahir() {
        return tempatlahir;
    }

    public void setTempatlahir(String tempatlahir) {
        this.tempatlahir = tempatlahir;
    }

    public Date getTgllahir() {
        return tgllahir;
    }

    public void setTgllahir(Date tgllahir) {
        this.tgllahir = tgllahir;
    }

    public String getGelarId() {
        return gelarId;
    }

    public void setGelarId(String gelarId) {
        this.gelarId = gelarId;
    }

    public String getJenisId() {
        return jenisId;
    }

    public void setJenisId(String jenisId) {
        this.jenisId = jenisId;
    }

    public String getNoId() {
        return noId;
    }

    public void setNoId(String noId) {
        this.noId = noId;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getNasabahGroup1() {
        return nasabahGroup1;
    }

    public void setNasabahGroup1(String nasabahGroup1) {
        this.nasabahGroup1 = nasabahGroup1;
    }

    public String getNasabahGroup2() {
        return nasabahGroup2;
    }

    public void setNasabahGroup2(String nasabahGroup2) {
        this.nasabahGroup2 = nasabahGroup2;
    }

    public String getNasabahGroup3() {
        return nasabahGroup3;
    }

    public void setNasabahGroup3(String nasabahGroup3) {
        this.nasabahGroup3 = nasabahGroup3;
    }

    public String getNasabahGroup4() {
        return nasabahGroup4;
    }

    public void setNasabahGroup4(String nasabahGroup4) {
        this.nasabahGroup4 = nasabahGroup4;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getNamaKuasa() {
        return namaKuasa;
    }

    public void setNamaKuasa(String namaKuasa) {
        this.namaKuasa = namaKuasa;
    }

    public String getAlamatKuasa() {
        return alamatKuasa;
    }

    public void setAlamatKuasa(String alamatKuasa) {
        this.alamatKuasa = alamatKuasa;
    }

    public String getPekerjaanKuasa() {
        return pekerjaanKuasa;
    }

    public void setPekerjaanKuasa(String pekerjaanKuasa) {
        this.pekerjaanKuasa = pekerjaanKuasa;
    }

    public Date getTgllahirKuasa() {
        return tgllahirKuasa;
    }

    public void setTgllahirKuasa(Date tgllahirKuasa) {
        this.tgllahirKuasa = tgllahirKuasa;
    }

    public String getNoDin() {
        return noDin;
    }

    public void setNoDin(String noDin) {
        this.noDin = noDin;
    }

    public String getNamaAlias() {
        return namaAlias;
    }

    public void setNamaAlias(String namaAlias) {
        this.namaAlias = namaAlias;
    }

    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public String getNama1Nasabah() {
        return nama1Nasabah;
    }

    public void setNama1Nasabah(String nama1Nasabah) {
        this.nama1Nasabah = nama1Nasabah;
    }

    public String getNama2Nasabah() {
        return nama2Nasabah;
    }

    public void setNama2Nasabah(String nama2Nasabah) {
        this.nama2Nasabah = nama2Nasabah;
    }

    public String getNama3Nasabah() {
        return nama3Nasabah;
    }

    public void setNama3Nasabah(String nama3Nasabah) {
        this.nama3Nasabah = nama3Nasabah;
    }

    public String getNama4Nasabah() {
        return nama4Nasabah;
    }

    public void setNama4Nasabah(String nama4Nasabah) {
        this.nama4Nasabah = nama4Nasabah;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getKodePos() {
        return kodePos;
    }

    public void setKodePos(String kodePos) {
        this.kodePos = kodePos;
    }

    public String getKotaId() {
        return kotaId;
    }

    public void setKotaId(String kotaId) {
        this.kotaId = kotaId;
    }

    public String getKelurahan() {
        return kelurahan;
    }

    public void setKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
    }

    public Double getJenisNasabah() {
        return jenisNasabah;
    }

    public void setJenisNasabah(Double jenisNasabah) {
        this.jenisNasabah = jenisNasabah;
    }

    public String getNoPaspor() {
        return noPaspor;
    }

    public void setNoPaspor(String noPaspor) {
        this.noPaspor = noPaspor;
    }

    public String getNoAkteAkhir() {
        return noAkteAkhir;
    }

    public void setNoAkteAkhir(String noAkteAkhir) {
        this.noAkteAkhir = noAkteAkhir;
    }

    public Date getTglAkteAkhir() {
        return tglAkteAkhir;
    }

    public void setTglAkteAkhir(Date tglAkteAkhir) {
        this.tglAkteAkhir = tglAkteAkhir;
    }

    public String getKodeNegara() {
        return kodeNegara;
    }

    public void setKodeNegara(String kodeNegara) {
        this.kodeNegara = kodeNegara;
    }

    public String getKodeArea() {
        return kodeArea;
    }

    public void setKodeArea(String kodeArea) {
        this.kodeArea = kodeArea;
    }

    public String getPekerjaanId() {
        return pekerjaanId;
    }

    public void setPekerjaanId(String pekerjaanId) {
        this.pekerjaanId = pekerjaanId;
    }

    public Long getAkumJasaPinj() {
        return akumJasaPinj;
    }

    public void setAkumJasaPinj(Long akumJasaPinj) {
        this.akumJasaPinj = akumJasaPinj;
    }

    public Long getIndexShuPinj() {
        return indexShuPinj;
    }

    public void setIndexShuPinj(Long indexShuPinj) {
        this.indexShuPinj = indexShuPinj;
    }

    public Long getShuPinj() {
        return shuPinj;
    }

    public void setShuPinj(Long shuPinj) {
        this.shuPinj = shuPinj;
    }

    public Long getAkumSimp() {
        return akumSimp;
    }

    public void setAkumSimp(Long akumSimp) {
        this.akumSimp = akumSimp;
    }

    public Long getIndexShuSimp() {
        return indexShuSimp;
    }

    public void setIndexShuSimp(Long indexShuSimp) {
        this.indexShuSimp = indexShuSimp;
    }

    public Long getShuSimp() {
        return shuSimp;
    }

    public void setShuSimp(Long shuSimp) {
        this.shuSimp = shuSimp;
    }

    public String getIbuKandung() {
        return ibuKandung;
    }

    public void setIbuKandung(String ibuKandung) {
        this.ibuKandung = ibuKandung;
    }

    public String getKetGelar() {
        return ketGelar;
    }

    public void setKetGelar(String ketGelar) {
        this.ketGelar = ketGelar;
    }

    public String getKodeGolonganDebitur() {
        return kodeGolonganDebitur;
    }

    public void setKodeGolonganDebitur(String kodeGolonganDebitur) {
        this.kodeGolonganDebitur = kodeGolonganDebitur;
    }

    public String getTempatKerja() {
        return tempatKerja;
    }

    public void setTempatKerja(String tempatKerja) {
        this.tempatKerja = tempatKerja;
    }

    public String getKodeBidangUsaha() {
        return kodeBidangUsaha;
    }

    public void setKodeBidangUsaha(String kodeBidangUsaha) {
        this.kodeBidangUsaha = kodeBidangUsaha;
    }

    public String getKodeHubunganDebitur() {
        return kodeHubunganDebitur;
    }

    public void setKodeHubunganDebitur(String kodeHubunganDebitur) {
        this.kodeHubunganDebitur = kodeHubunganDebitur;
    }

    public String getPathFoto() {
        return pathFoto;
    }

    public void setPathFoto(String pathFoto) {
        this.pathFoto = pathFoto;
    }

    public String getPathTtangan() {
        return pathTtangan;
    }

    public void setPathTtangan(String pathTtangan) {
        this.pathTtangan = pathTtangan;
    }

    public String getNoRekShu() {
        return noRekShu;
    }

    public void setNoRekShu(String noRekShu) {
        this.noRekShu = noRekShu;
    }

    public Boolean getAnggota() {
        return anggota;
    }

    public void setAnggota(Boolean anggota) {
        this.anggota = anggota;
    }

    public String getNoNip() {
        return noNip;
    }

    public void setNoNip(String noNip) {
        this.noNip = noNip;
    }

    public Date getTglid() {
        return tglid;
    }

    public void setTglid(Date tglid) {
        this.tglid = tglid;
    }

    public Short getBlackList() {
        return blackList;
    }

    public void setBlackList(Short blackList) {
        this.blackList = blackList;
    }

    public String getTujuanPembukaanKyc() {
        return tujuanPembukaanKyc;
    }

    public void setTujuanPembukaanKyc(String tujuanPembukaanKyc) {
        this.tujuanPembukaanKyc = tujuanPembukaanKyc;
    }

    public String getSumberDanaKyc() {
        return sumberDanaKyc;
    }

    public void setSumberDanaKyc(String sumberDanaKyc) {
        this.sumberDanaKyc = sumberDanaKyc;
    }

    public String getPenggunaanDanaKyc() {
        return penggunaanDanaKyc;
    }

    public void setPenggunaanDanaKyc(String penggunaanDanaKyc) {
        this.penggunaanDanaKyc = penggunaanDanaKyc;
    }

    public String getKetPekerjaan() {
        return ketPekerjaan;
    }

    public void setKetPekerjaan(String ketPekerjaan) {
        this.ketPekerjaan = ketPekerjaan;
    }

    public Double getTanggalUlangtahun() {
        return tanggalUlangtahun;
    }

    public void setTanggalUlangtahun(Double tanggalUlangtahun) {
        this.tanggalUlangtahun = tanggalUlangtahun;
    }

    public Double getBulanUlangtahun() {
        return bulanUlangtahun;
    }

    public void setBulanUlangtahun(Double bulanUlangtahun) {
        this.bulanUlangtahun = bulanUlangtahun;
    }

    public Date getTglBuka() {
        return tglBuka;
    }

    public void setTglBuka(Date tglBuka) {
        this.tglBuka = tglBuka;
    }

    public Long getPendapatanKyc() {
        return pendapatanKyc;
    }

    public void setPendapatanKyc(Long pendapatanKyc) {
        this.pendapatanKyc = pendapatanKyc;
    }

    public String getAlamatDomisili() {
        return alamatDomisili;
    }

    public void setAlamatDomisili(String alamatDomisili) {
        this.alamatDomisili = alamatDomisili;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public Boolean getKawin() {
        return kawin;
    }

    public void setKawin(Boolean kawin) {
        this.kawin = kawin;
    }

    public String getNoSuratNikah() {
        return noSuratNikah;
    }

    public void setNoSuratNikah(String noSuratNikah) {
        this.noSuratNikah = noSuratNikah;
    }

    public String getNoKk() {
        return noKk;
    }

    public void setNoKk(String noKk) {
        this.noKk = noKk;
    }

    public String getIddebitur() {
        return iddebitur;
    }

    public void setIddebitur(String iddebitur) {
        this.iddebitur = iddebitur;
    }

    public String getFlagKirim() {
        return flagKirim;
    }

    public void setFlagKirim(String flagKirim) {
        this.flagKirim = flagKirim;
    }

    public String getCab() {
        return cab;
    }

    public void setCab(String cab) {
        this.cab = cab;
    }

    public String getNamaSID() {
        return namaSID;
    }

    public void setNamaSID(String namaSID) {
        this.namaSID = namaSID;
    }

    public String getResikoNasabah() {
        return resikoNasabah;
    }

    public void setResikoNasabah(String resikoNasabah) {
        this.resikoNasabah = resikoNasabah;
    }

    public String getKotaIdSid() {
        return kotaIdSid;
    }

    public void setKotaIdSid(String kotaIdSid) {
        this.kotaIdSid = kotaIdSid;
    }

    public Double getUserapp() {
        return userapp;
    }

    public void setUserapp(Double userapp) {
        this.userapp = userapp;
    }

    public Date getTglApp() {
        return tglApp;
    }

    public void setTglApp(Date tglApp) {
        this.tglApp = tglApp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getMaxPlafon() {
        return maxPlafon;
    }

    public void setMaxPlafon(Long maxPlafon) {
        this.maxPlafon = maxPlafon;
    }

    public String getAlamatBekerja() {
        return alamatBekerja;
    }

    public void setAlamatBekerja(String alamatBekerja) {
        this.alamatBekerja = alamatBekerja;
    }

    public Short getKodeSumberDana() {
        return kodeSumberDana;
    }

    public void setKodeSumberDana(Short kodeSumberDana) {
        this.kodeSumberDana = kodeSumberDana;
    }

    public Short getJmlTanggungan() {
        return jmlTanggungan;
    }

    public void setJmlTanggungan(Short jmlTanggungan) {
        this.jmlTanggungan = jmlTanggungan;
    }

    public String getPisahHarta() {
        return pisahHarta;
    }

    public void setPisahHarta(String pisahHarta) {
        this.pisahHarta = pisahHarta;
    }

    public String getPengurus1() {
        return pengurus1;
    }

    public void setPengurus1(String pengurus1) {
        this.pengurus1 = pengurus1;
    }

    public Long getPersenPengurus1() {
        return persenPengurus1;
    }

    public void setPersenPengurus1(Long persenPengurus1) {
        this.persenPengurus1 = persenPengurus1;
    }

    public String getNasabahGroup5() {
        return nasabahGroup5;
    }

    public void setNasabahGroup5(String nasabahGroup5) {
        this.nasabahGroup5 = nasabahGroup5;
    }

    public String getKtpPengurus1() {
        return ktpPengurus1;
    }

    public void setKtpPengurus1(String ktpPengurus1) {
        this.ktpPengurus1 = ktpPengurus1;
    }

    public String getPengurus2() {
        return pengurus2;
    }

    public void setPengurus2(String pengurus2) {
        this.pengurus2 = pengurus2;
    }

    public Long getPersenPengurus2() {
        return persenPengurus2;
    }

    public void setPersenPengurus2(Long persenPengurus2) {
        this.persenPengurus2 = persenPengurus2;
    }

    public String getNasabahGroup6() {
        return nasabahGroup6;
    }

    public void setNasabahGroup6(String nasabahGroup6) {
        this.nasabahGroup6 = nasabahGroup6;
    }

    public String getKtpPengurus2() {
        return ktpPengurus2;
    }

    public void setKtpPengurus2(String ktpPengurus2) {
        this.ktpPengurus2 = ktpPengurus2;
    }

    public String getIDslik() {
        return iDslik;
    }

    public void setIDslik(String iDslik) {
        this.iDslik = iDslik;
    }

    public String getAlamatPengurus1() {
        return alamatPengurus1;
    }

    public void setAlamatPengurus1(String alamatPengurus1) {
        this.alamatPengurus1 = alamatPengurus1;
    }

    public String getAlamatPengurus2() {
        return alamatPengurus2;
    }

    public void setAlamatPengurus2(String alamatPengurus2) {
        this.alamatPengurus2 = alamatPengurus2;
    }

    public String getKtpPengurus3() {
        return ktpPengurus3;
    }

    public void setKtpPengurus3(String ktpPengurus3) {
        this.ktpPengurus3 = ktpPengurus3;
    }

    public String getPengurus3() {
        return pengurus3;
    }

    public void setPengurus3(String pengurus3) {
        this.pengurus3 = pengurus3;
    }

    public Long getPersenPengurus3() {
        return persenPengurus3;
    }

    public void setPersenPengurus3(Long persenPengurus3) {
        this.persenPengurus3 = persenPengurus3;
    }

    public String getNasabahGroup7() {
        return nasabahGroup7;
    }

    public void setNasabahGroup7(String nasabahGroup7) {
        this.nasabahGroup7 = nasabahGroup7;
    }

    public String getAlamatPengurus3() {
        return alamatPengurus3;
    }

    public void setAlamatPengurus3(String alamatPengurus3) {
        this.alamatPengurus3 = alamatPengurus3;
    }

    public String getKodeKas() {
        return kodeKas;
    }

    public void setKodeKas(String kodeKas) {
        this.kodeKas = kodeKas;
    }

    public Double getStatusApproval() {
        return statusApproval;
    }

    public void setStatusApproval(Double statusApproval) {
        this.statusApproval = statusApproval;
    }

    public Double getUserApproval() {
        return userApproval;
    }

    public void setUserApproval(Double userApproval) {
        this.userApproval = userApproval;
    }

    public Double getUserid() {
        return userid;
    }

    public void setUserid(Double userid) {
        this.userid = userid;
    }

    public String getLinkNasabahId() {
        return linkNasabahId;
    }

    public void setLinkNasabahId(String linkNasabahId) {
        this.linkNasabahId = linkNasabahId;
    }

    public Date getTglPengkinianNas() {
        return tglPengkinianNas;
    }

    public void setTglPengkinianNas(Date tglPengkinianNas) {
        this.tglPengkinianNas = tglPengkinianNas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nasabahId != null ? nasabahId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nasabah)) {
            return false;
        }
        Nasabah other = (Nasabah) object;
        if ((this.nasabahId == null && other.nasabahId != null) || (this.nasabahId != null && !this.nasabahId.equals(other.nasabahId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "io.github.adahra.Perpustakaan.model.Nasabah[ nasabahId=" + nasabahId + " ]";
    }
    
}
