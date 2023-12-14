import comtypes.client
import os
import glob

def pptx_to_pdf(input_file_path, output_file_path):
    powerpoint = comtypes.client.CreateObject("Powerpoint.Application")
    powerpoint.Visible = 1

    if not os.path.isabs(input_file_path):
        input_file_path = os.path.abspath(input_file_path)

    deck = powerpoint.Presentations.Open(input_file_path)
    deck.SaveAs(output_file_path, 32) # 32 for the PDF format
    deck.Close()
    powerpoint.Quit()

def convert_files_in_folder(folder_path):
    pptx_files = glob.glob(os.path.join(folder_path, '*.pptx'))

    for pptx_file in pptx_files:
        pdf_file = os.path.splitext(pptx_file)[0] + '.pdf'
        print(f"Converting {pptx_file} to {pdf_file}...")
        pptx_to_pdf(pptx_file, pdf_file)

folder_path = 'C:\\Users\\daka1\\Downloads\\eml'
convert_files_in_folder(folder_path)
