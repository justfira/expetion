class struk extends barang {
    String NoFaktur;
    int JumlahBeli;
    double Total;

    public struk (String NoFaktur, String KodeBarang, String NamaBarang, double HargaBarang, int JumlahBeli){
            super(KodeBarang, NamaBarang, HargaBarang);
            this.NoFaktur = NoFaktur;

            if (HargaBarang < 0 || JumlahBeli < 0) {
                throw new IllegalArgumentException("Nilai dari harga barang atau jumlah beli barang tidak boleh mines/negatif!!");
            }
            this.JumlahBeli = JumlahBeli;
            this.Total = HargaBarang * JumlahBeli;
        }

        public void tampilkanData(){
            System.out.println("\n Bukti Struk Pembelanjaan");
            System.out.println("Nomor Faktur :" + NoFaktur);
            System.out.println("Kode Barang  :" + KodeBarang);
            System.out.println("Nama Barang  :" + NamaBarang);
            System.out.println("Harga Barang :" + HargaBarang);
            System.out.println("Jumlah Beli  :" + JumlahBeli);
            System.out.println("Total        :" + Total);
            System.out.println("\n ============================");
        }
    }
