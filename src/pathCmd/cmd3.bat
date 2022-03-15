set _my_datetime=%date%_%time%
set _my_datetime=%_my_datetime: =_%
set _my_datetime=%_my_datetime::=%
set _my_datetime=%_my_datetime:/=_%
set _my_datetime=%_my_datetime:.=_%
set _my_datetime=%_my_datetime:,=_%

cd C:\_bmv\13cmdLearn\output\
mkdir %_my_datetime%_run_result
cd C:\_bmv\13cmdLearn\

PowerShell -Command "Get-ChildItem -Force -Recurse C:\'Program Files'\Java\jdk-17.0.2\lib\src\* | convertto-html > C:\_bmv\13cmdLearn\output\%_my_datetime%_run_result\%_my_datetime%_content_jdk-17_0_2_lib_src.html"