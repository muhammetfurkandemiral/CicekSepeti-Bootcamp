# cicek.com Load Test

### Nasıl Çalıştırılır

 - Windows
    - `cd [apachej meter yolu] `
    - `jmeter.bat -n -t .jmx dosyayolu\JMeter_Cicek_Performans.jmx -e -o raporun oluşacağı yer dosya yolu\ -l raporun oluşacağı yer dosya yolu\log.log `

 - Mac
    - `cd [apachej meter yolu] `
    - ` sh jmeter -n -t .jmx dosyayolu/JMeter_Cicek_Performans.jmx -e -o raporun oluşacağı yer dosya yolu/ -l raporun oluşacağı yer dosya yolu/log.log `

> Örnek : 
> 
> <img src="https://user-images.githubusercontent.com/37184598/149785944-6219b1f9-59bb-4611-af0d-b71af234d3cd.png" alt="Cucumber Mizu Report" width="550" height="175">
>
> 
> `cd C:\Performance\apache-jmeter-5.4.3`
> 
> `jmeter.bat -n -t C:\Users\MFD\Desktop\JMETER\JMeter_Cicek_Performans.jmx -e -o C:\Users\MFD\Desktop\JMETER\htmlreports\ -l C:\Users\MFD\Desktop\JMETER\htmlreports\log.log`


**Not :** Heap Space Hatası alırsanız kodların en başına `JVM_ARGS=”-Xms8192m -Xmx8192m”` eklenmeli.

### Otomatik Load Test Raporu

Linke tıklayarak erişebilirsiniz : [https://muhammetfurkandemiral.github.io/JMeterReport/](https://mfurkandemiralreport.github.io/JMeterReport/)

### Load Test Cases

![cicek com](https://user-images.githubusercontent.com/37184598/149761002-2d9f72fa-250b-450e-85b3-94a7a3611f24.png)

### Manuel Load Test Raporu

#### LT - 1
![LT - 1](https://user-images.githubusercontent.com/37184598/149769723-72322fd6-e9b9-4e5e-bb8b-2abf5d4d7fc9.png)
#### LT - 2
![LT - 2](https://user-images.githubusercontent.com/37184598/149769725-308d612d-1103-49bd-b4f4-94005fc4ec4a.png)
#### LT - 3
![LT - 3](https://user-images.githubusercontent.com/37184598/149769731-7892954c-059e-465b-8bda-9cb1caf875d1.png)
#### LT - 4
![LT - 4](https://user-images.githubusercontent.com/37184598/149769733-6ad7bbff-0f72-41f2-9475-b65b6f629cd8.png)
