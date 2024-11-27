document.addEventListener("DOMContentLoaded", () => {
    const searchInput = document.querySelector('input[placeholder="Cari nama venue"]');
    const kotaSelect = document.querySelector('select:nth-of-type(1)');
    const olahragaSelect = document.querySelector('select:nth-of-type(2)');
    const cariButton = document.querySelector('.filter-container button:last-of-type'); // Tombol "Cari venue"
    const venues = document.querySelectorAll('.pro');

    function filterVenues() {
        const searchText = searchInput.value.toLowerCase();
        const selectedKota = kotaSelect.value.toLowerCase();
        const selectedOlahraga = olahragaSelect.value.toLowerCase();

        venues.forEach(venue => {
            const nama = venue.dataset.nama.toLowerCase();
            const kota = venue.dataset.kota.toLowerCase();
            const olahraga = venue.dataset.olahraga.toLowerCase();

            if (
                (nama.includes(searchText) || searchText === "") &&
                (kota === selectedKota || selectedKota === "pilih kota") &&
                (olahraga === selectedOlahraga || selectedOlahraga === "pilih cabang olahraga")
            ) {
                venue.style.display = "block"; // Tampilkan elemen
            } else {
                venue.style.display = "none"; // Sembunyikan elemen
            }
        });
    }

    // Event listener hanya untuk tombol "Cari venue"
    cariButton.addEventListener("click", filterVenues);
});