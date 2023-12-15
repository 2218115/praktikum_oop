CREATE TABLE tb_pemasoks(
    id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nama_pemasok VARCHAR(255) NOT NULL,
    alamat_pemasok VARCHAR(255) NOT NULL,
    telepon_pemasok VARCHAR(255) NOT NULL
) ENGINE = INNODB;