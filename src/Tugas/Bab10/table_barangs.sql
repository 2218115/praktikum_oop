CREATE TABLE tb_barangs(
    kode_barang VARCHAR(12) NOT NULL PRIMARY KEY,
    kategori_barang VARCHAR(255) NOT NULL,
    nama_pemasok VARCHAR(255) NOT NULL,
    pabrikan_barang VARCHAR(255) NOT NULL,
    nama_barang VARCHAR(255) NOT NULL,
    jumlah_barang INT NOT NULL DEFAULT 0
) ENGINE = INNODB;