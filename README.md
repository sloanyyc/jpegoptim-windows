# jpegoptim for Windows and java lib wrap

## Add Java wrap
## 添加了Java封装，仅Win10 x64 测试了。
调用 类似命令行调用，参数表中不能有空格
```java
import com.sloan.jpegoptim.JpegOptim;
# call
public static void main(String[] args) {
    JpegOptim.doExec("jpegoptim -d out -m 80 a.jpg");
}
```

This is just my own project files for easy building of [jpegoptim](https://github.com/tjko/jpegoptim) with [mozjpeg](https://github.com/mozilla/mozjpeg) and Microsoft Visual Studio.
Currently only 64-bit (x64) is targeted.

Modify & Fork from
https://github.com/XhmikosR/jpegoptim-windows


## Notes

* MultiThreaded; no need for the MSVC Runtime to be installed separately
* Built with LTCG
* Runs on Vista and newer
* Just test on Win10 Home x64

## Build Instructions

1. Clone the repository

  Alternatively you can do

  ```shell
  git clone --recursive https://github.com/sloanyyc/jpegoptim-windows.git
  ```

2. Download and install [Visual Studio 2019](https://visualstudio.microsoft.com/downloads/) (any edition)
3. Download [nasm](https://www.nasm.us/) and place `nasm.exe` somewhere into your `PATH`
4. Open `jpegoptim.sln` and build
