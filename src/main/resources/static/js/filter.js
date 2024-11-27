document.addEventListener('DOMContentLoaded', () => {
    const smallButton = document.querySelector('.small-button');
    const modal = document.getElementById('modal-filter');
    const applyFilter = document.getElementById('apply-filter');

    // Buka modal saat tombol kecil ditekan
    smallButton.addEventListener('click', () => {
        modal.style.display = 'flex';
    });

    // Terapkan filter dan tutup modal
    applyFilter.addEventListener('click', () => {
        modal.style.display = 'none';
    });

    // Tutup modal saat klik di luar modal
    window.addEventListener('click', (event) => {
        if (event.target === modal) {
            modal.style.display = 'none';
        }
    });
});