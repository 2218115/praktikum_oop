# Dokumentasi singkat untuk Project Praktikum BAB10

**Sistem Inventory Barang elektronik**

## struktur dari tabel tb_barangs

```sql
CREATE TABLE tb_barangs(
    kode_barang VARCHAR(12) NOT NULL PRIMARY KEY,
    kategori_barang VARCHAR(255) NOT NULL,
    nama_pemasok VARCHAR(255) NOT NULL,
    pabrikan_barang VARCHAR(255) NOT NULL,
    nama_barang VARCHAR(255) NOT NULL,
    jumlah_barang INT NOT NULL DEFAULT 0
) ENGINE = INNODB;
```

## struktur dari tabel tb_pemasoks

```sql
CREATE TABLE tb_pemasoks(
    id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nama_pemasok VARCHAR(255) NOT NULL,
    alamat_pemasok VARCHAR(255) NOT NULL,
    telepon_pemasok VARCHAR(255) NOT NULL
) ENGINE = INNODB;
```

## Penjelasan singkat tentang GUI

Terdapat 2 class GUI_Barang dan GUI_Pemasok

dan 2 tabel database yaitu tb_barangs dan tb_pemasoks

pada class GUI_Pemasok akan melakukan *CRUD* pada tb_pemasoks

pada class GUI_Barang akan melakukan *CRUD* pada tb_barangs
pada class GUI_Barang juga terdapat combo Box **pemasok** yang datanya di ambil dari tabel **tb_pemasoks**
maka dari itu class GUI_Barang juga akan mengakses dari data data yang sudah di tambahkan oleh GUI_Pemasok

Terima kasih👋
