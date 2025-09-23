# LAPORAN POST-TEST 3 PEMROGRAMAN BERORIENTASI OBJEK (MANAJEMEN DATA ASET INVESTASI)

**Nama: Nabil Daffa Athalasyah
NIM: 2409116090
Kelas: C 2024**

## (Lanjutan POSTTEST 2 ==> POSTTEST 3)

# A. GAMBAR FULL INPUT CODINGAN JAVA
## 1 Superclass & 2 Subclass:
<img width="244" height="91" alt="Screenshot 2025-09-23 220829" src="https://github.com/user-attachments/assets/c8aeb3b8-a6ba-4e51-bbda-9268206725c4" />

## Encapsulation:
<img width="833" height="763" alt="Screenshot 2025-09-23 212020" src="https://github.com/user-attachments/assets/27b8088b-5de8-42f7-b38a-2adc83a6c44c" />
<img width="833" height="332" alt="Screenshot 2025-09-23 212052" src="https://github.com/user-attachments/assets/2e800f23-c701-4812-8651-e8b48d83c48c" />

## Inheritance:
**1. Obligasi:**

<img width="468" height="24" alt="Screenshot 2025-09-23 220755" src="https://github.com/user-attachments/assets/e8534439-9cc3-4ea5-ad8d-7df982e8217d" />

**2. Saham:**

<img width="432" height="22" alt="Screenshot 2025-09-23 220809" src="https://github.com/user-attachments/assets/87bd813e-5603-49bb-8c5e-b224b429df11" />

## Overriding:
**1. Obligasi:**

<img width="837" height="141" alt="Screenshot 2025-09-23 221155" src="https://github.com/user-attachments/assets/2073ce80-194a-4e2e-b869-ced5df9d5246" />


**2. Saham:**

<img width="796" height="155" alt="Screenshot 2025-09-23 221206" src="https://github.com/user-attachments/assets/69009b88-5456-4597-b281-274cdd04cf46" />


# B. PENJELASAN INPUT
## 1 Superclass & 2 Subclass:

<img width="244" height="91" alt="Screenshot 2025-09-23 220829" src="https://github.com/user-attachments/assets/c8aeb3b8-a6ba-4e51-bbda-9268206725c4" />

Dalam program ini terdapat 1 superclass bernama AsetInvestasi yang menjadi dasar dari 2 subclass yaitu Obligasi dan Saham. Superclass menyimpan atribut umum seperti nama, nilai, dan jenis, sedangkan subclass menambahkan atribut dan perilaku khusus sesuai jenis investasinya.

## Encapsulation:

<img width="833" height="763" alt="Screenshot 2025-09-23 212020" src="https://github.com/user-attachments/assets/27b8088b-5de8-42f7-b38a-2adc83a6c44c" />
<img width="833" height="332" alt="Screenshot 2025-09-23 212052" src="https://github.com/user-attachments/assets/2e800f23-c701-4812-8651-e8b48d83c48c" />

Semua atribut di class AsetInvestasi ditetapkan sebagai private, sehingga tidak dapat diakses langsung dari luar class. Untuk mengakses atau mengubah nilai atribut, digunakan method getter dan setter. Hal ini sesuai dengan prinsip encapsulation, yang menjaga keamanan data dan mengontrol akses.

## Inheritance:
**1. Obligasi:**

<img width="468" height="24" alt="Screenshot 2025-09-23 220755" src="https://github.com/user-attachments/assets/e8534439-9cc3-4ea5-ad8d-7df982e8217d" />

Mewarisi atribut dan method dari AsetInvestasi, lalu menambahkan atribut baru seperti tingkatBunga dan jatuhTempo.

**2. Saham:**

<img width="432" height="22" alt="Screenshot 2025-09-23 220809" src="https://github.com/user-attachments/assets/87bd813e-5603-49bb-8c5e-b224b429df11" />

Mewarisi atribut dan method dari AsetInvestasi, kemudian menambahkan atribut khusus seperti dividen dan jumlahSaham.

## Overriding:
**1. Obligasi:**

<img width="837" height="141" alt="Screenshot 2025-09-23 221155" src="https://github.com/user-attachments/assets/2073ce80-194a-4e2e-b869-ced5df9d5246" />

Method tampilkanInfo() ditulis ulang untuk menampilkan informasi tambahan mengenai tingkat bunga dan jatuh tempo.

**2. Saham:**

<img width="796" height="155" alt="Screenshot 2025-09-23 221206" src="https://github.com/user-attachments/assets/69009b88-5456-4597-b281-274cdd04cf46" />

Method tampilkanInfo() ditulis ulang untuk menampilkan detail tambahan berupa dividen dan jumlah saham.
