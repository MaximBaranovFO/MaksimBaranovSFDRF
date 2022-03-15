set _my_datetime=%date%_%time%
set _my_datetime=%_my_datetime: =_%
set _my_datetime=%_my_datetime::=%
set _my_datetime=%_my_datetime:/=_%
set _my_datetime=%_my_datetime:.=_%
set _my_datetime=%_my_datetime:,=_%

cd C:\_bmv\13cmdLearn\output\
mkdir %_my_datetime%_run_result
cd C:\_bmv\13cmdLearn\

PowerShell -Command "Get-ChildItem -Force -Recurse C:\foop\* | convertto-html > C:\_bmv\13cmdLearn\output\%_my_datetime%_run_result\%_my_datetime%_content_foop.html"
PowerShell -Command "Get-ChildItem -Force -Recurse C:\ioop\* | convertto-html > C:\_bmv\13cmdLearn\output\%_my_datetime%_run_result\%_my_datetime%_content_ioop.html"
PowerShell -Command "Get-ChildItem -Force -Recurse C:\boop\* | convertto-html > C:\_bmv\13cmdLearn\output\%_my_datetime%_run_result\%_my_datetime%_content_boop.html"
PowerShell -Command "Get-ChildItem -Force -Recurse C:\doop\* | convertto-html > C:\_bmv\13cmdLearn\output\%_my_datetime%_run_result\%_my_datetime%_content_doop.html"
PowerShell -Command "Get-ChildItem -Force -Recurse C:\joop\* | convertto-html > C:\_bmv\13cmdLearn\output\%_my_datetime%_run_result\%_my_datetime%_content_joop.html"
PowerShell -Command "Get-ChildItem -Force -Recurse C:\_bmv\conv-foop\input\* | convertto-html > C:\_bmv\13cmdLearn\output\%_my_datetime%_run_result\%_my_datetime%_content_bmv_conv-foop_input.html"
PowerShell -Command "Get-ChildItem -Force -Recurse C:\_bmv\conv-foop\input20211114\* | convertto-html > C:\_bmv\13cmdLearn\output\%_my_datetime%_run_result\%_my_datetime%_content_bmv_conv-foop_input20211114.html"
PowerShell -Command "Get-ChildItem -Force -Recurse C:\_bmv\conv-foop\input20211222\* | convertto-html > C:\_bmv\13cmdLearn\output\%_my_datetime%_run_result\%_my_datetime%_content_bmv_conv-foop_input20211222.html"
PowerShell -Command "Get-ChildItem -Force -Recurse C:\_bmv\conv-foop\input20211228\* | convertto-html > C:\_bmv\13cmdLearn\output\%_my_datetime%_run_result\%_my_datetime%_content_bmv_conv-foop_input20211228.html"
PowerShell -Command "Get-ChildItem -Force -Recurse C:\_bmv\13cmdLearn\output\* | convertto-html > C:\_bmv\13cmdLearn\output_sum_index\%_my_datetime%_content_output.html"
PowerShell -Command "Get-ChildItem -Force -Recurse C:\_bmv\* | convertto-html > C:\_bmv\13cmdLearn\output_sum_index\%_my_datetime%_content__bmv_output.html"
PowerShell -Command "Get-ChildItem -Force -Recurse C:\Documents and Settings\* | convertto-html > C:\_bmv\13cmdLearn\output\%_my_datetime%_run_result\%_my_datetime%_content_Documents_and_Settings.html"