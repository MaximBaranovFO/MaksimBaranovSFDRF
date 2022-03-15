set _my_datetime=%date%_%time%
set _my_datetime=%_my_datetime: =_%
set _my_datetime=%_my_datetime::=%
set _my_datetime=%_my_datetime:/=_%
set _my_datetime=%_my_datetime:.=_%
set _my_datetime=%_my_datetime:,=_%

cd C:\_bmv\13cmdLearn\output\
mkdir %_my_datetime%_run_result__bmv
mkdir %_my_datetime%_run_result_boop
mkdir %_my_datetime%_run_result_doop
mkdir %_my_datetime%_run_result_ioop
mkdir %_my_datetime%_run_result_joop


PowerShell -Command "Get-ChildItem -Force -Recurse C:\_bmv\* | convertto-html -property Length,CreationTime,LastWriteTime,FullName  > C:\_bmv\13cmdLearn\output\%_my_datetime%_run_result__bmv\%_my_datetime%_content_folder__bmv.html"
PowerShell -Command "Get-ChildItem -Force -Recurse C:\boop\* | convertto-html -property Length,CreationTime,LastWriteTime,FullName  > C:\_bmv\13cmdLearn\output\%_my_datetime%_run_result_boop\%_my_datetime%_content_folder_boop.html"
PowerShell -Command "Get-ChildItem -Force -Recurse C:\doop\* | convertto-html -property Length,CreationTime,LastWriteTime,FullName  > C:\_bmv\13cmdLearn\output\%_my_datetime%_run_result_doop\%_my_datetime%_content_folder_doop.html"
PowerShell -Command "Get-ChildItem -Force -Recurse C:\ioop\* | convertto-html -property Length,CreationTime,LastWriteTime,FullName  > C:\_bmv\13cmdLearn\output\%_my_datetime%_run_result_ioop\%_my_datetime%_content_folder_ioop.html"
PowerShell -Command "Get-ChildItem -Force -Recurse C:\joop\* | convertto-html -property Length,CreationTime,LastWriteTime,FullName  > C:\_bmv\13cmdLearn\output\%_my_datetime%_run_result_joop\%_my_datetime%_content_folder_joop.html"
